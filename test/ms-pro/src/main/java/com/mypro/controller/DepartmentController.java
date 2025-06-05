package com.mypro.controller;

import com.mypro.common.Result;
import com.mypro.entity.po.Department;
import com.mypro.service.DepartmentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Resource
    DepartmentService departmentService;

    @GetMapping("selectDepartment")
    public Result selectDepartment(){
        List<Department> list = departmentService.selectDepartment();
        return Result.success(list);
    }
}
