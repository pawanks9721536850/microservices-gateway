package com.contact.ContactService.service;

import com.contact.ContactService.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContactService {
    List<Contact> getContactsOfUser(int userId );
}
