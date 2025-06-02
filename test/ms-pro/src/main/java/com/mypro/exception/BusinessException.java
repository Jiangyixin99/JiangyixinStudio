package com.mypro.exception;

import com.mypro.enums.ResponseEnum;

public class BusinessException extends RuntimeException {
    private Integer code;
    private String msg;

    public BusinessException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public BusinessException(ResponseEnum responseEnum){
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
