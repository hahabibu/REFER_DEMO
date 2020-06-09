import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login.vue'
import Home from '../components/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path:'/login',component:Login
  },
  // 指定重定向路径
  {
    path:'/',redirect:'/login'
  },
  // 定义主页面
  {
    path:'/home',component:Home
  }
]

const router = new VueRouter({
  routes
})

// 挂载路由导航守卫
router.beforeEach((to, from, next) => {
  // to 将要访问的路径
  // from 代表从哪个页面跳转而来
  // next 是一个函数， 表示方形
  // next() 放行 next('/') 强制跳转
  // 首页直接放行
  if (to.path === '/login') return next()
  // 获取token
  const tokenStr = window.sessionStorage.getItem('token')
  // token不为空，放行
  if (!tokenStr) return next('/login')
  next()
})


export default router
