package com.xg.service;

import com.xg.bean.Dog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xg on 2017/11/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DogServiceTest {
    @Autowired
    private DogService dogService;
    @Test
    public void findOne(){
        Dog dog=dogService.findOne(1);
        Assert.assertEquals(new Integer(1),dog.getAge());
    }

}
