package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    private String role;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "phone")
    private String phone;

    // 🆕 Added in Version 1 only
    @Column(name = "status")
    private String status;

    public User() {
    }

    // ================= GETTERS =================

    public Long getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRole() {
        return role;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getPhone() {
        return phone;
    }

    // 🆕 Added in Version 1 only
    public String getStatus() {
        return status;
    }

    // ================= SETTERS =================

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 🆕 Added in Version 1 only
    public void setStatus(String status) {
        this.status = status;
    }
}