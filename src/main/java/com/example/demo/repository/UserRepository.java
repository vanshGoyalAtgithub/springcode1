package com.example.demo.repository;

import com.example.demo.entity.User; // Add missing import
import org.springframework.data.jpa.repository.JpaRepository; // Add missing import

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}