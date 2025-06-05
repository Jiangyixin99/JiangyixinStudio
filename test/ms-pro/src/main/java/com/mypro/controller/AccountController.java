package com.mypro.controller;

import com.mypro.enums.ResponseEnum;
import com.mypro.exception.BusinessException;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {
@Resource
    private UserInfoController userInfoController;


}
