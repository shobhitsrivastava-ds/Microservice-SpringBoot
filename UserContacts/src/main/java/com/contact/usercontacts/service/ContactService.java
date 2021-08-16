package com.contact.usercontacts.service;

import com.contact.usercontacts.entity.Contract;

import java.util.List;

public interface ContactService {
    public List<Contract> getContacts(Long userId);
}
