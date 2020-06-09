<template>
  <div>
   HOME 组件
    <el-button type="info" @click="logout">退出登录</el-button>
  </div>
</template>
<script>
export default {
    methods: {
        logout(){
            console.log('退出登录操作执行');
            // 清除本地token
            window.sessionStorage.clear();
            // 跳转到登录页面
            this.$router.push("/login");
        }
    },
};
</script>

<style lang="less" scoped>
</style>
