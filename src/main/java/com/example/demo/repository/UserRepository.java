package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // ✔ common in both versions
    Optional<User> findByEmail(String email);

    // 🆕 added in Version 1
    long countByRole(String role);

    long countByRoleAndStatus(String role, String status);
}