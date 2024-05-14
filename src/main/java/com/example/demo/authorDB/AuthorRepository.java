package com.example.demo.authorDB;

import com.example.demo.authorDB.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
