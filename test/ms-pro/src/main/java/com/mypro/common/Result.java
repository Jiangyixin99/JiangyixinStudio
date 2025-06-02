package com.mypro.common;

import com.mypro.enums.ResponseEnum;

public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.setCode(ResponseEnum.SUCCESSFUL.getCode());
        result.setMsg(ResponseEnum.SUCCESSFUL.getMsg());
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(ResponseEnum.SERVER_ERROR.getCode());
        result.setMsg(ResponseEnum.SERVER_ERROR.getMsg());
        return result;
    }

    //查数据并转换成json发送到前端
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(ResponseEnum.SUCCESSFUL.getCode());
        result.setMsg(ResponseEnum.SUCCESSFUL.getMsg());
        result.setData(data);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

