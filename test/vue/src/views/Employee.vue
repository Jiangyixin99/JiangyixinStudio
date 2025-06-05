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
        <!-- 用户数据表格 -->
        <el-table :data="data.tableData">
            <el-table-column label="名称" prop="name" />
            <el-table-column label="性别" prop="sex" />
            <el-table-column label="工号" prop="no" />
            <el-table-column label="年龄" prop="age" />
            <el-table-column label="个人介绍" prop="description" />
            <el-table-column label="部门" prop="departmentName" />
            <!-- scope.row获取行对象 注意:是对象 不是单纯的数据 -->
            <el-table-column label="操作">
                <template #default="scope">
                    <el-button link type="primary" icon="edit" @click="handleUpdate(scope.row)"> 编辑
                    </el-button>
                    <el-button link type="danger" icon="delete" @click="deleteEmployeeByNo(scope.row)"> 删除
                    </el-button>
                </template>
            </el-table-column>

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
                        <el-radio value="1" label="男"></el-radio>
                        <el-radio value="0" label="女"></el-radio>
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

                <el-form-item label="部门">
                    <el-select v-model="data.form.departmentId" placeholder="请选择部门名称" size="large" style="width: 240px">
                        <el-option v-for="item in data.department" :key="item.id" :label="item.name" :value="item.id" />
                    </el-select>
                </el-form-item>

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
import { ref, reactive, onMounted } from 'vue';
import Api from '@/const/Api'


const data = reactive({
    name: null,
    tableData: [],
    pageNum: 1,
    pageSize: 10,
    total: 0,
    formVisible: false,
    editVisible: false,
    form: {},
    department: {}
})
//调用java中的
// 将数据库的数据写入到表格中
//表格查询功能
async function load() {
    const res = await request.get(Api.selectPage, {
        params: {
            pageNum: data.pageNum,
            pageSize: data.pageSize,
            name: data.name
        }
    })
    data.tableData = res.data.list
    data.total = res.data.total
}

//表格查询重置功能
const reset = () => {
    data.name = null
    load()
}

//表格新增员工显示部门数据功能
async function getDepartment() {
    const res = await request.get(Api.selectDepartment)
    data.department = res.data
}

//表格新增员工的弹窗显示功能
function handleAdd() {
    getDepartment()
    data.form = {}
    data.formVisible = true
}

function handleUpdate(row) {
    getDepartment()
    // 将对象中的数据提取给data.form 而不是直接修改对象row 
    data.form = JSON.parse(JSON.stringify(row))
    data.formVisible = true
}

//表格新增员工弹窗的保存功能
async function save() {
    data.form.id ? edit() : add()
}
//表格新增员工的新增功能
async function add() {
    const res = await request.post(Api.insertEmployee, data.form)
    if (res.code === 200) {
        ElMessage.success('操作成功')
        // 关闭弹窗
        data.formVisible = false
        load()
    } else {
        ElMessage.error(res.msg)
    }
}
//表格编辑员工信息功能
async function edit() {
    const res = await request.put(Api.updateEmployee, data.form)
    if (res.code === 200) {
        ElMessage.success('操作成功')
        // 关闭弹窗`
        data.formVisible = false
        load()
    } else {
        ElMessage.error(res.msg)
    }
}

// 表格删除员工信息功能
async function deleteEmployeeByNo(row) {
    data.form = JSON.parse(JSON.stringify(row))
    const res = await request.delete(Api.deleteEmployeeById, {
        params: {
            "id": data.form.id
        }
    })
    load()
}

onMounted(() => {
    load()
})

</script>
