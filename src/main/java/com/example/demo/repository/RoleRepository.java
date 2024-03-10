package com.example.demo.repository;

import com.example.demo.entity.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@ComponentScan
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    Role save(Role role);


}