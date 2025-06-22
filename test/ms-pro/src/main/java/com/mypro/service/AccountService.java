package com.mypro.service;

import com.mypro.entity.po.Employee;
import com.mypro.entity.po.UserInfo;
import com.mypro.enums.ResponseEnum;
import com.mypro.exception.BusinessException;
import com.mypro.exception.GlobalExceptionHandler;
import com.mypro.mapper.EmployeeMapper;
import com.mypro.mapper.UserInfoMapper;
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
}
