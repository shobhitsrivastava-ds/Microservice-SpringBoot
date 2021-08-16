package com.contact.usercontacts.entity;

public class Contract {
    private Long cId;
    private String email;
    private String contactName;

    private Long userId;

    // Constructors


    public Contract() {
    }

    public Contract(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    // getters
    public Long getcId() {
        return cId;
    }

    public String getEmail() {
        return email;
    }

    public String getContactName() {
        return contactName;
    }

    public Long getUserId() {
        return userId;
    }

    // setters
    public void setcId(Long cId) {
        this.cId = cId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
}
