package com.xg.controller;

import com.xg.bean.Dog;
import com.xg.bean.Result;
import com.xg.repository.DogRepository;
import com.xg.service.DogService;
import com.xg.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by xg on 2017/10/29.
 */
@RestController
public class DogController {
    @Autowired
    private DogRepository dogRepository;
    @Autowired
    private DogService dogService;

    @GetMapping(value = "/dogs")
    public List<Dog> dogList() {
        return dogRepository.findAll();
    }

/*    @PostMapping(value = "/dogs/save")
    public Dog dogAdd(@Valid Dog dog, BindingResult  bindingResult) {
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return  null;
        }
        dog.setDogName(dog.getDogName());
        dog.setAge(dog.getAge());
        return dogRepository.save(dog);
    }*/

    @PostMapping(value = "/dogs/save")
    public Result<Dog> dogAdd(@Valid Dog dog, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //System.out.println(bindingResult.getFieldError().getDefaultMessage());
            /*Result result=new Result();
            result.setCode(1);
            result.setMsg(bindingResult.getFieldError().getDefaultMessage());*/
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        dog.setDogName(dog.getDogName());
        dog.setAge(dog.getAge());
/*        Result  result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setDate(dogRepository.save(dog));*/
        return ResultUtil.success(dogRepository.save(dog));
        //return dogRepository.save(dog);
    }

    @GetMapping(value = "/dogs/{id}")
    public Dog dogFindOne(@PathVariable("id") Integer id) {
        return dogRepository.findOne(id);
    }

    @PutMapping(value = "/dogs/{id}")
    public Dog dogUpdate(@PathVariable("id") Integer id, @RequestParam("dogName") String dogName, @RequestParam("age") Integer age) {
        Dog dog = new Dog();
        dog.setId(id);
        dog.setDogName(dogName);
        dog.setAge(age);
        return dogRepository.save(dog);
    }

    @DeleteMapping(value = "/dogs/{id}")
    public void dogDelete(@PathVariable("id") Integer id) {
        dogRepository.delete(id);
    }

    @GetMapping(value = "/dogs/age/{age}")
    public List<Dog> dogListByAge(@PathVariable("age") Integer age) {
        return dogRepository.findByAge(age);
    }

    @PostMapping(value = "/dogs/tow")
    public void dogTow() {
        dogService.insertTow();
    }

    @GetMapping(value = "/dogs/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
      dogService.getAge(id);
    }
}
