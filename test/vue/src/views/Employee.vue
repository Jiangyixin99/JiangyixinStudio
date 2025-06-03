<!-- 数据页 -->
<template>
    <div class="card">
        <el-input style="width: 240px; margin-right: 12px;" v-model="data.name" placeholder="请输入名称查询"
            prefix-icon="Search">
        </el-input>
        <el-button type="primary" @click="load()">查询</el-button>
        <el-button type="primary" @click="reset()">重置</el-button>
    </div>

    <div class="card" style="margin-bottom: 5px;">
        <el-button type="primary" @click="handleAdd()">新增</el-button>
        <el-button type="primary">批量删除</el-button>
        <!-- <el-button type="primary">导入</el-button>
        <el-button type="primary">导出</el-button> -->
    </div>

    <div class="card" style="margin-bottom: 5px;">
        <!-- 表格 -->
        <el-table :data="data.tableData">
            <el-table-column label="名称" prop="name" />
            <el-table-column label="性别" prop="sex" />
            <el-table-column label="工号" prop="no" />
            <el-table-column label="年龄" prop="age" />
            <el-table-column label="个人介绍" prop="description" />
            <el-table-column label="部门" prop="departmentName" />
        </el-table>
        <!-- 页码 -->
        <div style="margin-top: 10px;">
            <el-pagination @change="load" v-model:current-change="data.pageNum" v-model:page-size="data.pageSize"
                background layout="total, sizes, prev, pager, next, jumper" :total="data.total"
                :page-sizes="[5, 10, 15, 20]" />
        </div>

        <!-- 新增的弹窗 -->
        <el-dialog title="新增员工" v-model="data.formVisible" width="500px">
            <el-form :model="data.form" label-width="80px" style="padding-right: 40px; padding-top: 20px;">

                <el-form-item label="名称">
                    <el-input v-model="data.form.name" autocomplete="off" placeholder="请输入名称" />
                </el-form-item>

                <el-form-item label="性别">
                    <el-radio-group v-model="data.form.sex">
                        <el-radio value="男" label="男"></el-radio>
                        <el-radio value="女" label="女"></el-radio>
                    </el-radio-group>
                </el-form-item>

                <el-form-item label="工号">
                    <el-input v-model="data.form.no" autocomplete="off" placeholder="请输入工号" />
                </el-form-item>

                <el-form-item label="年龄">
                    <el-input-number style="width: 180px" :min="18" v-model="data.form.age" autocomplete="off"
                        placeholder="请输入年龄" />
                </el-form-item>

                <el-form-item label="个人介绍">
                    <el-input :rows="3" type="textarea" v-model="data.form.description" autocomplete="off"
                        placeholder="请输入个人介绍" />
                </el-form-item>

                <!-- <el-form-item label="部门">
                    <el-input v-model="data.form.departmentName" autocomplete="off" />
                </el-form-item> -->

            </el-form>

            <template #footer>
                <div class="dialog-footer">
                    <el-button @click="data.formVisible = false">取消</el-button>
                    <el-button type="primary" @click="save()"> 保存 </el-button>
                </div>
            </template>

        </el-dialog>

    </div>
</template>

<script setup>
import request from '@/utils/request.js';
import { ElMessage } from 'element-plus';
import { ref, reactive } from 'vue';


const data = reactive({
    name: null,
    tableData: [],
    pageNum: 1,
    pageSize: 10,
    total: 0,
    formVisible: false,
    form: {}
})
//调用java中的
// 将数据库的数据写入到表格中
const load = () => {
    request.get('/employee/selectPage', {
        params: {
            pageNum: data.pageNum,
            pageSize: data.pageSize,
            name: data.name
        }
    }).then(res => {
        data.tableData = res.data.list
        data.total = res.data.total
    })
}
load()
//查询重置
const reset = () => {
    data.name = null
    load()
}
// 新增按钮的弹窗显示
const handleAdd = () => {
    data.formVisible = true
    data.form = {}
}
// 保存
const save = () => {
    request.post('/employee/insertEmployee', data.form).then(res => {
        if (res.code === 200) {
            ElMessage.success('操作成功')
            data.formVisible = false
            load()
        } else {
            ElMessage.error(res.msg)
        }
    })
}
</script>
