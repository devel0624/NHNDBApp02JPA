package com.nhnacademy.dbapp.jpa.repository;


import com.nhnacademy.dbapp.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
