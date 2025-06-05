package com.mypro.enums;

public enum EmployeeSexEnum {
    WOMEN(0,"女"),
    MAN(1, "男"),
    UNKNOW(2,"未知");

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    EmployeeSexEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
