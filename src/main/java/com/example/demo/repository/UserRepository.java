package com.example.demo.repository;

import com.example.demo.entity.User; // Add missing import
// Add missing import

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@ComponentScan(basePackages = "com.example.demo")
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}