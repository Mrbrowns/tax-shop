import Vue from 'vue'
import ElementUI from 'element-ui'
import Icon from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import locale from 'element-ui/lib/locale/lang/zh-CN'
import App from './App'
import router from './router'
import store from './store'

import '@/icons' // icon
import '@/permission' // 权限
import api from '@/api/index'
Vue.prototype.$api = api;

// 配置百度编辑器


Vue.use(ElementUI, { locale })
Vue.use(Icon)
Vue.config.productionTip = false

new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: { App }
})