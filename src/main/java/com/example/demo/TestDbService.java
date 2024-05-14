package com.example.demo;

import com.example.demo.authorDB.Author;
import com.example.demo.authorDB.AuthorRepository;
import com.example.demo.personDB.Person;
import com.example.demo.personDB.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDbService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AuthorRepository authorRepository;
    public Person addPerson(Person person){
return personRepository.save(person);
    }
    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }
}
