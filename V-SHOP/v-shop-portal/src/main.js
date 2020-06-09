import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './plugins/element.js'


// 导入全局样式表(需要手动将文件放置在指定目录)
import './assets/css/global.css'
// 导入字体图标css文件(需要手动将文件放置在指定目录)
import './assets/fonts/iconfont.css'

// 引入axios库,用于通信
import axios from 'axios'
// 配置请求的根路径
axios.defaults.baseURL = 'http://127.0.0.1:8888/api/private/v1/'
Vue.prototype.$http = axios




Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
