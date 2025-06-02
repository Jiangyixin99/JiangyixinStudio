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

    @RequestMapping("selectAllEmployee")
    public Result selectAllEmployee() {
        List<Employee> list = employeeService.selectAllEmployee();
        return Result.success(list);
    }
//路径参数 @PathVariable
    @RequestMapping("selectAllEmployee/{id}")
    public Result selectById(@PathVariable Integer id) {
        Employee employee = employeeService.selectById(id);
        return Result.success(employee);
    }

    @RequestMapping("selectPage")
    public Result selectPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "2") Integer pageSize){
        return Result.success(employeeService.selectPage(pageNum,pageSize));
    }

    @RequestMapping("insertEmployee")
    public Result insertEmployee(@RequestBody Employee employee){
        employeeService.insertEmployee(employee);
        return Result.success();
    }

    @RequestMapping("updateEmployee")
    public Result update(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return Result.success();
    }

    @RequestMapping("deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        employeeService.deleteById(id);
        return Result.success();
    }
}
