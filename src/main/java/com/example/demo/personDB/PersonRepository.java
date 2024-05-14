package com.example.demo.personDB;

import com.example.demo.personDB.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
