package com.mypro.exception;

import com.mypro.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//标识他是全局处理 捕获 地址所处的异常
@ControllerAdvice("com.mypro.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody //标识 返回json
    public Result error(Exception e) {
        return Result.error();
    }
//    标识会处理的异常
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
//    用异常测试
    public Result error(BusinessException e){
        return Result.error(e.getCode(),e.getMsg());
    }
}
