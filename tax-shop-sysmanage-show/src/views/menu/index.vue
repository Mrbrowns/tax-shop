<template>
  <el-container>
    <transition name="el-fade-in-linear">
      <div v-show="show3" >
    <el-aside width="200px" >
      <menu-tree></menu-tree>
    </el-aside>
      </div>
    </transition>
    <el-container>
      <el-header style="text-align: right; font-size: 12px">
     <!--   <el-dropdown>
          <i class="el-icon-setting" style="margin-right: 15px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>查看</el-dropdown-item>
            <el-dropdown-item>新增</el-dropdown-item>
            <el-dropdown-item>删除</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>-->
        <el-button @click="show3 = !show3">新增</el-button>
        <el-button @click="show3 = !show3">{{show3?'收起':'展开'}}</el-button>
      </el-header>
      <el-main v-bind:style="{ 'height': mainHeight + 'px'}">
        <menu-detail></menu-detail>
      </el-main>
    </el-container>
  </el-container>
</template>
<script>
  import CollapseTransition from 'element-ui/lib/transitions/collapse-transition';
  import MenuTree from './components/MenuTree'
  import MenuDetail from './components/MenuDetail'
  import Lodash from 'lodash'

  export default {
    name: 'menuIndes',
    components: { MenuTree,MenuDetail,CollapseTransition},
    data: function () {
      return {
        show3:true,
        mainHeight: document.body.clientHeight-150
      }
    },
    mounted: function () {
      const that = this
      // _.debounce 是一个通过 lodash 限制操作频率的函数。
      window.onresize = _.debounce(() => {
        console.log("onresize:" + that.mainHeight)
        that.mainHeight = document.body.clientHeight
      }, 400)
    }
  };
</script>
<style scoped>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }
  .left-side{
    margin-top: 20px;
    margin-left: 20px;
  }
  .right-side{
       margin-top: 20px;
        margin-left: 20px;
  }
</style>
