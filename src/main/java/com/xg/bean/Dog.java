package com.xg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by xg on 2017/10/29.
 */
@Entity
public class Dog {
    @Id
    @GeneratedValue
    private  Integer id;

    private String dogName;

    //@Min(value = 1, message = "年龄不能小于1")
    @NotNull(message = "不能为空")
    private Integer age;

    public Dog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
