package com.xg.controller;

import com.xg.bean.Obj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xg
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "First SpringBoot!";
    }

    @Value("${height}")
    private Integer height;

    @Value("${name}")
    private String name;

    @Value("${object}")
    private String object;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getValue() {
        return name + height;
    }

    @RequestMapping(value = "/getobj", method = RequestMethod.GET)
    public String getObj() {
        return object;
    }
    @Autowired
    private Obj obj;
    @RequestMapping(value = "/obj", method = RequestMethod.GET)
    public String getObjs() {
        return obj.getName();
    }

}
