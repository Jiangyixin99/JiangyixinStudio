package com.mypro.mapper;

import com.mypro.entity.po.UserInfo;

public interface UserInfoMapper {
    UserInfo selectById(String id);
    void insert();
}
