package com.example.demo;

import com.example.demo.authorDB.Author;
import com.example.demo.personDB.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDbController {

    @Autowired
    private TestDbService testDbService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
return testDbService.addPerson(person);
    }
    @PostMapping("/addAuthor")
    public Author addPerson(@RequestBody Author author){
        return testDbService.addAuthor(author);
    }
}
