import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    //重定向
    { path: '/', redirect: '/manager/home' },

    {
      path: '/manager', name: 'manager', component: () => import('../views/Manager.vue'), children: [
        { path: 'home', name: 'home', meta: { title: '主页' }, component: () => import('../views/Home.vue'), },
        { path: 'test', name: 'test', meta: { title: '测试页' }, component: () => import('../views/Test.vue'), },
        { path: 'employee', name: 'employee', meta: { title: '员工信息' }, component: () => import('../views/Employee.vue'), },

      ]
    },
    // 登录
    { path: '/login', name: 'Login', meta: { title: '登录系统' }, component: () => import('../views/Login.vue'), },
    // 注册
    { path: '/register', name: 'Register', meta: { title: '注册系统' }, component: () => import('../views/Register.vue'), },

    { path: '/404', name: 'NotFound', meta: { title: '404找不到页面' }, component: () => import('../views/404.vue'), },

    { path: '/:pathMatch(.*)', redirect: '/404' }
  ],
})
//beforeEach跳转之前的操作
//to是跳转后的router对象 from是当前页面
router.beforeEach((to, from, next) => {
  document.title = to.meta.title
  next()
})
export default router
