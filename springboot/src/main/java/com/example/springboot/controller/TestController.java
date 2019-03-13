package com.example.springboot.controller;

import com.example.springboot.dao.PersonRepository;
import com.example.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/test")
    public String test(Model model){
        List<Person> personList = new ArrayList<>();
        personList = personRepository.findAll();
        model.addAttribute("personList",personList);
        return "test.html";
    }
}
