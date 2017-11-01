package com.xg.enums;

/**
 * Created by xg on 2017/10/30.
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1, "系统错误"),
    SUCCESS(0, "成功"),
    YOUNG(100, "young dog"),
    OLD(101, "old dog");


    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
