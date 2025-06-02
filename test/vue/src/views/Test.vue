<template>
    <!-- 传递了这个页面的参数 -->
    <!-- <el-button type="info" @click="router.push('/?id=1&name=jiangyixin')">跳转到home并传参数</el-button> -->

    <div>测试页</div>
</template>
<script setup>
import router from '@/router';
import { reactive } from 'vue';

//路由传的参数
const data = reactive({
    id: router.currentRoute.value.query.id,
    name: router.currentRoute.value.query.name,
})
console.log(data.id)
</script>
<style scoped>
div {
    color: rgb(67, 144, 206);
}
</style>
