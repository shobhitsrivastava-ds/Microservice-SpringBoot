package com.contact.usercontacts.Controller;

import com.contact.usercontacts.entity.Contract;
import com.contact.usercontacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contract> getContacts(@PathVariable("userId") Long userId)
    {
        return this.contactService.getContacts(userId);
    }
}
