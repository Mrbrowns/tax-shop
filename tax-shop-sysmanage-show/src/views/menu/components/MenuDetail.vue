<template>
  <div class="createPost-container" >
    <el-form class="form-container" :model="postForm" :rules="rules" ref="postForm">
      <div class="createPost-main-container">
        <el-row>
            菜单基本信息
        </el-row>
        <el-row>
          <el-col :span="21">
            <el-form-item style="margin-bottom: 40px;" prop="menuName">
              <MDinput name="name" v-model="postForm.menuName" required :maxlength="100">
                菜单名称
              </MDinput>
             <!-- <span v-show="postForm.title.length>=26" class='title-prompt'>app可能会显示不全</span>-->
            </el-form-item>

            <div class="postInfo-container">
              <el-row>
                <el-form-item label="上级菜单" prop="parentMenu">
                  <el-input >{{labelName}}</el-input>
                </el-form-item>

              </el-row>
              <el-row>
                <el-form-item label="菜单URL" prop="menuUrl">
                  <el-input v-model="postForm.menuUrl"></el-input>
                </el-form-item>

              </el-row>
            </div>
          </el-col>
        </el-row>


        <el-form-item>
          <el-button type="primary" @click="submitForm()">提交</el-button>
          <el-button @click="resetForm('postForm')">重置</el-button>
        </el-form-item>

      </div>
    </el-form>

  </div>
</template>

<script>
import Tinymce from '@/components/Tinymce'
import Upload from '@/components/Upload/singleImage3'
import MDinput from '@/components/MDinput'
import Multiselect from 'vue-multiselect'// 使用的一个多选框组件，element-ui的select不能满足所有需求
import 'vue-multiselect/dist/vue-multiselect.min.css'// 多选框组件css
import Sticky from '@/components/Sticky' // 粘性header组件
import { validateURL } from '@/utils/validate'
import { fetchArticle } from '@/api/article'
import { userSearch } from '@/api/remoteSearch'

const defaultForm = {
  title: '', // 文章题目
  content: '', // 文章内容
  content_short: '', // 文章摘要
  source_uri: '', // 文章外链
  menuUrl:'',//菜单URL
  source_name: '', // 文章外部作者
  display_time: undefined, // 前台展示时间
  id: undefined,
  comment_disabled: false,
  menuName:'',//菜单名字
  parentLabel:''

}

export default {
  name: 'MenuDetail',
  components: { Tinymce, MDinput, Upload, Multiselect, Sticky },
  props: {
    isEdit: {
      type: Boolean,
      default: false
    }
  },

  data() {
    const validateRequire = (rule, value, callback) => {
      if (value === '') {
        this.$message({
          message: rule.field + '为必传项',
          type: 'error'
        })
        callback(null)
      } else {
        callback()
      }
    }
    const validateSourceUri = (rule, value, callback) => {
      if (value) {
        if (validateURL(value)) {
          callback()
        } else {
          this.$message({
            message: '外链url填写不正确',
            type: 'error'
          })
          callback(null)
        }
      } else {
        callback()
      }
    }
    return {
      postForm: Object.assign({}, defaultForm),
      fetchSuccess: true,
      loading: false,
      userLIstOptions: [],
      rules: {
        image_uri: [{ validator: validateRequire }],
        title: [{ validator: validateRequire }],
        content: [{ validator: validateRequire }],
        source_uri: [{ validator: validateSourceUri, trigger: 'blur' }]
      }
    }
  },
  computed: {
    labelName(){
      return this.$store.state.labelName;
    },
    contentShortLength() {
      return this.postForm.content_short.length
    },
  },
  created() {
    if (this.isEdit) {
      this.fetchData()
    } else {
      this.postForm = Object.assign({}, defaultForm)
    }
  },
  methods: {
    fetchData() {
      fetchArticle().then(response => {
        this.postForm = response.data
      }).catch(err => {
        this.fetchSuccess = false
        console.log(err)
      })
    },
    submitForm() {
      this.postForm.display_time = parseInt(this.display_time / 1000)
      console.log(this.postForm)
      this.$refs.postForm.validate(valid => {
        if (valid) {
          this.loading = true
          this.$notify({
            title: '成功',
            message: '发布文章成功',
            type: 'success',
            duration: 2000
          })
          this.postForm.status = 'published'
          this.loading = false
        } else {
          console.log('error submit!!')
          return false
        }
      })
    }, resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    draftForm() {
      if (this.postForm.content.length === 0 || this.postForm.title.length === 0) {
        this.$message({
          message: '请填写必要的标题和内容',
          type: 'warning'
        })
        return
      }
      this.$message({
        message: '保存成功',
        type: 'success',
        showClose: true,
        duration: 1000
      })
      this.postForm.status = 'draft'
    },
    getRemoteUserList(query) {
      userSearch(query).then(response => {
        if (!response.data.items) return
        console.log(response)
        this.userLIstOptions = response.data.items.map(v => ({
          key: v.name
        }))
      })
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  @import "src/styles/mixin.scss";
  .title-prompt{
    position: absolute;
    right: 0px;
    font-size: 12px;
    top:10px;
    color:#ff4949;
  }
  .createPost-container {
    position: relative;
    .createPost-main-container {
      padding: 0px 45px 20px 50px;
      .postInfo-container {
        position: relative;
        @include scrollBar;
        margin-bottom: 10px;
        .postInfo-container-item {
          float: left;
        }
      }
      .editor-container {
        min-height: 500px;
        margin: 0 0 30px;
        .editor-upload-btn-container {
            text-align: right;
            margin-right: 10px;
            .editor-upload-btn {
                display: inline-block;
            }
        }
      }
    }
    .word-counter {
      width: 40px;
      position: absolute;
      right: -10px;
      top: 0px;
    }
  }
</style>

