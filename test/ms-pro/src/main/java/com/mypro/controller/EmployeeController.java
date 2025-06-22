package com.mypro.controller;

import com.mypro.common.Result;
import com.mypro.entity.po.Employee;
import com.mypro.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    //注入员工服务层对象
    @Resource
    private EmployeeService employeeService;

    //分页查询
    @GetMapping("selectPage")
    public Result selectPage(
            Employee employee,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "2") Integer pageSize) {
        return Result.success(employeeService.selectPage(employee, pageNum, pageSize));
    }

    //新增员工数据
    @PostMapping("insertEmployee")
    public Result insertEmployee(@RequestBody Employee employee) {
        employeeService.insertEmployee(employee);
        return Result.success();
    }

    @PutMapping("updateEmployee")
    public Result update(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return Result.success();
    }

    @DeleteMapping("deleteById")
    public Result deleteById(@RequestParam Integer id) {
        employeeService.deleteById(id);
        return Result.success();
    }

    //@RequestParam 前端传配置
    //@RequestBody 前端传对象

    //未使用
    //路径参数 @PathVariable

    @DeleteMapping("deleteBatch")
    public Result deleteById(@RequestBody List<Integer> ids) {
        employeeService.deleteBatch(ids);
        return Result.success();
    }
}
