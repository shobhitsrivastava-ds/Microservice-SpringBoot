package com.example.user_service.user_service.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    // Variables
    private Long userId;
    private String name;
    private String phone;
    List<Contract> contacts= new ArrayList();

    // Constructors
    public User() { 
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User(Long userId, String name, String phone, List<Contract> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    // setters
    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Contract> getContacts() {
        return contacts;
    }

    // setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContacts(List<Contract> contacts) {
        this.contacts = contacts;
    }
}
