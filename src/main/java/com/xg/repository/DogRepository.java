package com.xg.repository;

import com.xg.bean.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xg on 2017/10/29.
 */
public interface DogRepository extends JpaRepository<Dog,Integer>{
    //拓展
    public List<Dog> findByAge(Integer age);

}
