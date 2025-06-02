<!-- 数据页 -->
<template>
    <div class="card">
        <el-input style="width: 240px; margin-right: 12px;" v-model="data.name" placeholder="请输入名称查询"
            prefix-icon="Search">
        </el-input>
        <el-button type="primary">查询</el-button>
        <el-button type="primary">重置</el-button>
    </div>

    <div class="card" style="margin-bottom: 5px;">
        <el-button type="primary">新增</el-button>
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
    </div>
</template>

<script setup>
import request from '@/utils/request';
import { reactive } from 'vue';

const data = reactive({
    name: null,
    tableData: [],
    tableData: [

    ],
    pageNum: 1,
    pageSize: 10,
    total: 0
})
const load = () => {
    request.request('employee/selectPage', {
        params: {
            pageNum: data.pageNum,
            pageSize: data.pageSize
        }
    }).then(res => {
        data.tableData = res.data.list
        data.total = res.data.total
    })
}
load()
</script>
