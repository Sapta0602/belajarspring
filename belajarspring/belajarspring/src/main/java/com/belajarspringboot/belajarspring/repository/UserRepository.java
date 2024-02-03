package com.belajarspringboot.belajarspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belajarspringboot.belajarspring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
}
