package com.mypro.controller;

import com.mypro.common.Result;
import com.mypro.entity.po.Employee;
import com.mypro.service.AccountService;
import com.mypro.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @Resource
    private EmployeeService employeeService;
    @Resource
    private AccountService accountService;

    @PostMapping("login")
    public Result login(@RequestBody Employee employee){
        accountService.login(employee);
        return Result.success();
    }



}
