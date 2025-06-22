<template>
    <div class="login-container">
        <div class="login-box card">
            <div style="padding: 50px 30px;">
                <!-- 表单 -->
                <el-form ref="formRef" :rules="data.rules" :model="data.from">
                    <!-- 标题 -->
                    <div style="font-size: 3vh; text-align: center; margin-bottom: 10px; color: black;">后台管理系统</div>
                    <!-- 账号 -->
                    <el-form-item prop="username">
                        <el-input size="large" v-model="data.from.username" placeholder="请输入账号"
                            prefix-icon="User"></el-input>

                    </el-form-item>
                    <!-- 密码 -->
                    <el-form-item prop="password">
                        <el-input show-password size="large" v-model="data.from.password" placeholder="请输入密码"
                            prefix-icon="Lock"></el-input>
                    </el-form-item>

                    <div style="margin-bottom: 20px;">
                        <el-button @click="login()" size="large" style="width: 100%;" type="primary">
                            登录
                        </el-button>
                    </div>
                    <div style="text-align: right;">
                        还没有账号?请 <a style="color: #0742b1; text-decoration: none;" href="/register">注册</a>
                    </div>
                </el-form>
            </div>




        </div>
    </div>
</template>

<script setup>
import Api from '@/const/Api';
import { ElMessage } from 'element-plus';
import { reactive, ref } from 'vue';
import request from '@/utils/request.js';

const data = reactive({
    from: {},
    rules: {
        username: [{ required: true, message: '请输入账号', trigger: 'blur' }],
        password: [{ required: true, message: '请输入密码', trigger: 'blur' }]
    }

})
const formRef = ref()

async function login() {
    const valid = await formRef.value.validate()
    if (valid) {
        const res = await request.post(Api.login, data.from)
        if (res.code === 200) {
            ElMessage.success('登录成功')
            location.href = '/manager/home'
        } else {
            ElMessage.error(res.msg)
        }
    }
    return
}

</script>
<style>
.login-container {
    position: relative;
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    overflow: hidden;
    justify-content: center;
    user-select: none;
}

/* 用伪元素做背景图 */
.login-container::before {
    content: '';
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    background-image: url("@/assets/loginBackground.jpg");
    background-size: cover;
    opacity: 0.3;
    z-index: -1;
}

.login-box {
    display: flex;
    flex-direction: column;
    margin: 0 auto;
    background-color: whitesmoke;
    width: 35vh;
    justify-content: center;
}
</style>