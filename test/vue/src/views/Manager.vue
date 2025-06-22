<script setup>
import router from '@/router';

</script>

<template>
    <div>
        <!-- 头部begin -->
        <div style="height: 60px; background-color: #3c7fff; display: flex; align-items: center;">

            <div style="display: flex; width: 200px; align-items: center; margin-left: 10px;">
                <img style="width: 40px;" src="@\assets\coffee.png" alt="">
                <span style="font-size: 20px; color: white;"> 后台管理系统 </span>
            </div>

            <div style="flex: 1;"></div>

            <div style="width: fit-content; display: flex; align-items: center; margin-right: 20px;">
                <img src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png" alt=""
                    style="width: 40px; height: 40px; ">
                <span style="color: white; margin-left: 5px;">江一欣</span>
            </div>

        </div>
        <!-- 头部end -->

        <!-- 左侧导航栏begin -->
        <div style="display: flex; ">
            <!-- 这个 router 可以设置菜单的路由给el-menu-item 设置index 后面跟路由地址 -->
            <!-- :default-active是动态设置当前el-menu中 选中的el-menu-item项 -->
            <div style="width: 200px; border-right: 1px solid #ddd; min-height: calc(100vh - 60px);">
                <el-menu router :default-active="router.currentRoute.value.path" style="border: 0;">

                    <el-menu-item index="/manager/home">
                        <el-icon>
                            <House />
                        </el-icon>
                        系统首页
                    </el-menu-item>

                    <el-sub-menu index="1">
                        <template #title>
                            <el-icon>
                                <User />
                            </el-icon>
                            <span>用户管理</span>
                        </template>
                        <el-menu-item>管理员信息</el-menu-item>
                        <el-menu-item index="/manager/employee">员工信息</el-menu-item>
                    </el-sub-menu>


                    <el-menu-item index="/manager/test">
                        <el-icon>
                            <Loading />
                        </el-icon>
                        测试页
                    </el-menu-item>

                    <el-menu-item index="/manager">
                        <el-icon>
                            <Avatar />
                        </el-icon>
                        个人信息
                    </el-menu-item>

                    <el-menu-item index="/login">
                        <el-icon>
                            <SwitchButton />
                        </el-icon>
                        退出登录
                    </el-menu-item>

                </el-menu>
            </div>
            <!-- 左侧导航栏end -->

            <!-- 右侧主体begin -->
            <div style="flex: 1; width: 0; background-color: #f5f7ff; height: calc(100vh - 60px);">
                <RouterView></RouterView>
            </div>
            <!-- 右侧主体end -->

        </div>
    </div>
</template>

<style scoped>
/* .is-active是被选中的菜单项 */
.el-menu .is-active,
.el-menu .el-sub-menu .el-menu-item .is-active {
    background-color: #e6ecf7;
}
</style>