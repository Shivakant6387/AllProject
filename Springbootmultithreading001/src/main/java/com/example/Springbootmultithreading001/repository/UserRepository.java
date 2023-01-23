package com.example.Springbootmultithreading001.repository;

import com.example.Springbootmultithreading001.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
