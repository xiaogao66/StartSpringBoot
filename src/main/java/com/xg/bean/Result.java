package com.xg.bean;

/**
 * http 请求返回最外层对象
 * Created by xg on 2017/10/30.
 */
public class Result<T> {
    private Integer code;//错误代码
    private String msg;//提示信息
    private T date;//具体的内容

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

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
