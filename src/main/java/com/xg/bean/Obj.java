package com.xg.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xg on 2017/10/28.
 */
@Component
@ConfigurationProperties(prefix = "objs")
public class Obj {
    private  String name;
    private Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
