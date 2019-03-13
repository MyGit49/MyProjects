package com.example.springboot.dao;

import com.example.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    public List<Person> findByAge(Integer age);
}
