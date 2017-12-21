<template>
  <div>
  <el-input
    style="    width: 90%;
    margin: 10px 5px 0 10px;"
    placeholder="输入关键字进行过滤"
    v-model="filterText">
  </el-input>
       <el-tree style="background-color: rgb(238, 241, 246);position: absolute;margin: 20px;"
      :data="data4"
      :props="defaultProps"
      node-key="id"
      default-expand-all
      :expand-on-click-node="false"
      @node-click="handleNodeClick"
      :filter-node-method="filterNode"
      ref="tree2">
      </el-tree>
  </div>
</template>
<script>
  let id = 1000;

  export default {
    name:"menuTree",
    watch: {
      filterText(val) {
        this.$refs.tree2.filter(val);
      }
    },
    data() {
      return {
        filterText: '',
        data4:
         [{id: 0
        ,label: '菜单管理',children: [{
          id: 1,
          label: '后台系统管理',
          children: [{
            id: 4,
            label: '用户管理',
            children: [{
              id: 9,
              label: '三级 1-1-1'
            }, {
              id: 10,
              label: '三级 1-1-2'
            }]
          }]
        }, {
          id: 2,
          label: '一级 2',
          children: [{
            id: 5,
            label: '二级 2-1'
          }, {
            id: 6,
            label: '二级 2-2'
          }]
        }, {
          id: 3,
          label: '一级 3',
          children: [{
            id: 7,
            label: '二级 3-1'
          }, {
            id: 8,
            label: '二级 3-2'
          }]
        }]
        }],
        defaultProps: {
          children: 'children',
          label: 'label'
        }
      }
    },

    methods: {
      handleNodeClick(data) {
        console.log(data);
      },
      append(data) {
        const newChild = { id: id++, label: 'testtest', children: [] };
        if (!data.children) {
          this.$set(data, 'children', []);
        }
        data.children.push(newChild);
      },
      remove(node, data) {
        const parent = node.parent;
        const children = parent.data.children || parent.data;
        const index = children.findIndex(d => d.id === data.id);
        children.splice(index, 1);
      },
      filterNode(value, data) {
        if (!value) return true;
        return data.label.indexOf(value) !== -1;
      },
      renderContent(h, { node, data, store }) {
        return (
          <span style="flex: 1; display: flex; align-items: center; justify-content: space-between; font-size: 14px; padding-right: 8px;">
          <span>
          <span>{node.label}</span>
        </span>
        <span>
        <el-button style="font-size: 12px;" type="text" on-click={ () => this.append(data) }>Append</el-button>
        <el-button style="font-size: 12px;" type="text" on-click={ () => this.remove(node, data) }>Delete</el-button>
        </span>
        </span>);
      }
    }
  };
</script>

