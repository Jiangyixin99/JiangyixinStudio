package com.mypro.service;

import com.mypro.entity.po.UserInfo;
import com.mypro.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    // TODO 添加验证码
    public void register(String email, String password, UserInfo userInfo){
//    userInfoMapper.insert(password,email,userInfo);
    }
}
