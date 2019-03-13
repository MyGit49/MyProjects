package com.example.springboot.controller;

import com.example.springboot.dao.PersonRepository;
import com.example.springboot.entity.Person;
import com.example.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonService personService;
    @GetMapping("/person")
    private List<Person> personList(){
        return personRepository.findAll();
    }

    @PostMapping("/person")
    public Person personAdd(@RequestParam("name") String name,@RequestParam("age") Integer age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    @GetMapping("/person/{id}")
    public Optional<Person> personFindById(@PathVariable("id") Integer id){
        return personRepository.findById(id);
    }

    @DeleteMapping("/person/{id}")
    public void personDelete(@PathVariable("id") Integer id){
        personRepository.deleteById(id);
    }

    @PutMapping("/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    @GetMapping("/person/age/{age}")
    public List<Person> personListByAge(@PathVariable("age") Integer age){
        return personRepository.findByAge(age);
    }

    @PostMapping("/person/two")
    public void personTwo(){
        personService.insertTwo();
    }
}
