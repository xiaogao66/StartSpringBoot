package com.xg.exception;

import com.xg.bean.Dog;
import com.xg.enums.ResultEnum;

/**
 * Created by xg on 2017/10/30.
 */
public class DogException extends RuntimeException {
    private Integer code;

    public DogException(ResultEnum resultEnum, String message) {
        super(message);
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
