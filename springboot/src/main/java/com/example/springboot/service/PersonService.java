package com.example.springboot.service;

import com.example.springboot.dao.PersonRepository;
import com.example.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void insertTwo(){
        Person person1 = new Person();
        person1.setName("夏洛");
        person1.setAge(23);
        personRepository.save(person1);

        //System.out.println(1/0);

        Person person2 = new Person();
        person2.setName("秋雅");
        person2.setAge(19);
        personRepository.save(person2);
    }
}
