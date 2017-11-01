package com.xg.service;

import com.xg.bean.Dog;
import com.xg.enums.ResultEnum;
import com.xg.exception.DogException;
import com.xg.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by xg on 2017/10/30.
 */
@Service
public class DogService {
    @Autowired
    private DogRepository dogRepository;

    @Transactional
    public void insertTow() {

        Dog dog1 = new Dog();
        dog1.setDogName("t1");
        dog1.setAge(2);

        dogRepository.save(dog1);

        Dog dog2 = new Dog();
        dog2.setDogName("t1");
        dog2.setAge(3);

        dogRepository.save(dog2);

    }


    public void getAge(Integer id) throws Exception {
        Dog dog = dogRepository.findOne(id);
        Integer age = dog.getAge();
        if (age < 2) {
            //throw new Exception("young dog");
            throw new DogException(ResultEnum.YOUNG, "young dog");
        } else if (age > 1) {
            //throw new Exception("old dog");
            throw new DogException(ResultEnum.OLD, "old dog");
        }

    }

    /**
     *
     * @param id
     * @return
     */
    public Dog findOne(Integer id) {
       return dogRepository.findOne(id);
    }

}
