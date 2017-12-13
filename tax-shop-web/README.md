# tax-shop-web

> 财税+前台
## 项目目录以及文件结构
```
build	这个是我们最终发布的时候会把代码发布在这里，在开发阶段，我们基本不用管。
config	配置目录，默认配置没有问题，所以我们也不用管
node_modules	项目开发依赖的一些模块
src	开发目录（绝大多数工作都是在这里开展）
static	资源目录
test	初始测试目录，没用，删除即可
.xxxx文件	这些是一些配置文件，包括语法配置，git配置等。基本不用管，放着就是了
index.html	首页入口文件，基本不用管，如果是开发移动端项目，可以在head区域加上你合适的meta头
package.json	项目配置文件。前期基本不用管，但是你可以找一下相关的资料，学习一下里面的各项配置。至少，要知道分别是干嘛的。初期就不管了。
README.md	不用管
```
##src文件夹
```
src文件夹下面的初始情况，里面有一些示例代码之类的。比如，它吧logo放在assets文件夹里面。

commponents目录里面放了一个演示的组件文件。
router文件放路由配置文件；
App.vue是项目入口文件。
main.js这是项目的核心文件，全局的配置都在这个文件里面配置
其中App.vue项目入口代码如下：
<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>


核心文件main.js代码如下：
// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})

这个配核心配置文件，就是引入vue，导入入口vue以及引入路由，最后new了一个Vue实例对象，来加载数据。

router文件夹下的index.js

import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    }
  ]
})
```
17666548130
## 安装步骤

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

```

vue.js 核心，不解释。
VueRouter2 实现路由组织工具。
webpack 项目打包以及编译工具。
nodejs 前端开发环境。
npm 前端包管理器。
axios ajax 接口请求工具。
sass-loader 和 node-sass css 预处理。
element 基于 vue 的后台组件库。
iview 基于 vue 的另一套后台组件库。
vue-cli vue 项目脚手架。一键安装 vue 全家桶的工具。


```
├── App.vue                         // APP入口文件
├── api                             // 接口调用工具文件夹
│   └── index.js                    // 接口调用工具
├── components                      // 组件文件夹，目前为空
├── config                          // 项目配置文件夹
│   └── index.js                    // 项目配置文件
├── frame                           // 子路由文件夹
│   └── frame.vue                   // 默认子路由文件
├── main.js                         // 项目配置文件
├── page                                // 我们的页面组件文件夹
│   ├── content.vue             // 准备些 cnodejs 的内容页面
│   └── index.vue                   // 准备些 cnodejs 的列表页面
├── router                          // 路由配置文件夹
│   └── index.js                    // 路由配置文件
├── style                           // scss 样式存放目录
│   ├── base                        // 基础样式存放目录
│   │   ├── _base.scss          // 基础样式文件
│   │   ├── _color.scss     // 项目颜色配置变量文件
│   │   ├── _mixin.scss     // scss 混入文件
│   │   └── _reset.scss     // 浏览器初始化文件
│   ├── scss                        // 页面样式文件夹
│   │   ├── _content.scss       // 内容页面样式文件
│   │   └── _index.scss     // 列表样式文件
│   └── style.scss              // 主样式文件
└── utils                           // 常用工具文件夹
    └── index.js                    // 常用工具文件
 
 
 
 ├── css             // 放一些第三方的样式文件
 ├── font                // 放字体图标文件
 ├── image           // 放图片文件，如果是复杂项目，可以在这里面再分门别类
 └── js              // 放一些第三方的JS文件，如 jquery   
    
    
 
  ```  
