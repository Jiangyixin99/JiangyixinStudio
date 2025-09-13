package com.mypro.service;

import cn.hutool.core.util.StrUtil;
import com.mypro.entity.po.Employee;
import com.mypro.entity.po.UserInfo;
import com.mypro.enums.ResponseEnum;
import com.mypro.exception.BusinessException;

import com.mypro.mapper.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {


    @Autowired
    private EmployeeMapper employeeMapper;

    // TODO 添加验证码
//    public void register(String email, String password, UserInfo userInfo){
//  userInfoMapper.insert(password,email,userInfo);
//    }
    //登录
    public Employee login(Employee employee) {
        String username = employee.getUsername();
        Employee dbEmployee = employeeMapper.selectByUsername(username);
        //校验
        if (dbEmployee == null) {
            throw new BusinessException(ResponseEnum.ACCOUNT_OR_PASSWORD_ERROR);
        }
        String password = employee.getPassword();
        if (!dbEmployee.getPassword().equals(password)) {
            throw new BusinessException(ResponseEnum.ACCOUNT_OR_PASSWORD_ERROR);
        }
        return dbEmployee;
    }

    public void register(Employee employee) {
        //数据库员工对象
        Employee dbEmployee = employeeMapper.selectByUsername(employee.getUsername());
        //校验
        if (dbEmployee != null) {
            throw new BusinessException(ResponseEnum.ACCOUNT_ALREADY_EXISTS);
        }
        //判断是否为空 给予一个密码默认值
        if (StrUtil.isBlank(employee.getPassword())) {
            employee.setPassword("123");
        }
        if(StrUtil.isBlank(employee.getName())){
            employee.setName(employee.getUsername());
        }
//        一定要设置角色
        employee.setRole("EMP");
        employeeMapper.insert(employee);
    }
}
