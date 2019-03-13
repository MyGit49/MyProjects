package com.example.springboot.controller;

import com.example.springboot.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @Autowired
   private PersonProperties personProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        System.out.println("1111111");
        return personProperties.getName()+personProperties.getAge();
    }
}
