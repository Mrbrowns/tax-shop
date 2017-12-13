<template>
  <div class="dashboard-container">
    <div class="dashboard-text">name:{{list.name}}</div>
    <div class="dashboard-text">role:<input v-model="list.id"></div>
    <upload-excel-component></upload-excel-component>
  </div>
</template>
<script>
  import UploadExcelComponent from '@/components/UploadExcel/index.vue'
  export default {
    components:{UploadExcelComponent},
    data() {
      return { tableData: [],
        tableHeader: [],
        list: {
        name:null,
          id:null
        }
      }
    },
    created () {
      this.$api.get('job/get/2',null, r => {
        this.list=r;
      })
    },Methods:{
      selected(data) {
        this.tableData = data.results
        this.tableHeader = data.header
      }
    }
  }
</script>
