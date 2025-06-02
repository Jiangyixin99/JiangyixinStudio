package com.mypro.enums;

public enum ResponseEnum {
    ARGUMENT_ERROR(400, "参数错误"),
    SERVER_ERROR(500, "服务器内部异常,请联系管理员"),
    SUCCESSFUL(200, " 请求成功"),
    NOT_FOUND_ERROR(404, "找不到地址");

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
