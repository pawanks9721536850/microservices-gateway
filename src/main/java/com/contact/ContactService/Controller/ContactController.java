package com.contact.ContactService.Controller;

import com.contact.ContactService.entity.Contact;
import com.contact.ContactService.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService ;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") int userId )
    {
        return contactService.getContactsOfUser(userId);
    }
}
