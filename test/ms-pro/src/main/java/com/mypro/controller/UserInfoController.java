package com.mypro.controller;

import com.mypro.common.Result;
import com.mypro.entity.po.UserInfo;
import com.mypro.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("UserInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;
    @RequestMapping("selectUserInfo/{id}")
    public Result selectUserInfo(@PathVariable String id){
        UserInfo userInfo = userInfoService.userInfo(id);
        return Result.success(userInfo);
    }


}
