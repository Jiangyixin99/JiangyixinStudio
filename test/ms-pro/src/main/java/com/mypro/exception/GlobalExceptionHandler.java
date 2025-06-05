package com.mypro.exception;

import com.mypro.common.Result;
import com.mypro.enums.ResponseEnum;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


//标识他是全局处理 捕获 地址所处的异常
@ControllerAdvice("com.mypro.controller")
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //标识要捕获的异常类
    @ExceptionHandler(Exception.class)
    @ResponseBody //标识 返回json
    public Result error(Exception e, HttpServletRequest httpServletRequest) {

        logger.debug("服务器异常,请求地址:http://localhost:7071:" + httpServletRequest.getRequestURI() + ", 异常信息: ", e);

        Result result = new Result();

        if (e instanceof DataIntegrityViolationException) {
           result.setMsg(ResponseEnum.ARGUMENT_ERROR.getMsg());
           result.setCode(ResponseEnum.ARGUMENT_ERROR.getCode());
        } else if (e instanceof BusinessException) {
            result.setCode(((BusinessException) e).getCode());
            result.setMsg(((BusinessException) e).getMsg());
        } else {
            result.setMsg(ResponseEnum.SERVER_ERROR.getMsg());
            result.setCode(ResponseEnum.SERVER_ERROR.getCode());
        }
        return result;
    }

}
