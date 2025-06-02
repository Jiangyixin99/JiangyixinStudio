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
        <el-button type="primary">导入</el-button>
        <el-button type="primary">导出</el-button>
    </div>
    <div class="card" style="margin-bottom: 5px;">
        <!-- 表格 -->
        <el-table :data="data.tableData">
            <el-table-column label="日期" prop="date" />
            <el-table-column label="名称" prop="name" />
            <el-table-column label="地址" prop="address" />
        </el-table>
        <!-- 页码 -->
        <div style="margin-top: 10px;">
            <el-pagination v-model:current-change="data.pageNum" v-model:page-size="data.pageSize" background
                layout="total, sizes, prev, pager, next, jumper" :total="50" :page-sizes="[5, 10, 15, 20]" />
        </div>
    </div>
</template>

<script setup>
import { reactive } from 'vue';

const data = reactive({
    name: null,
    tableData: [
        { id: 1, date: '2024-10-11', name: '江一欣', address: '江西赣州' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },
        { id: 2, date: '2024-10-1', name: '江二欣', address: '江西宜春' },

    ]
})
</script>
