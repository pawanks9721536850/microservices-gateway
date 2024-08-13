package com.contact.ContactService.service;

import com.contact.ContactService.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
   List<Contact> contactList= List.of(
           new Contact(1l , "pawan@taazaa.com" , "pawan" ,1),
           new Contact(6l , "pks@taazaa.com" , "pawan" ,1),
           new Contact(2l , "anshika@taazaa.com" , "anshika" ,2),
           new Contact(3l , "harish@taazaa.com" , "harish" ,3)
   );

   @Override
   public  List<Contact> getContactsOfUser(int userId )
    {
        List<Contact> contact = new ArrayList<>();

        for ( int i = 0 ; i < contactList.size() ; i++ )
        {
            if ( contactList.get(i).getUserId() == userId )
            {
                contact.add(contactList.get(i));
            }

        }
        return contact ;
    }
}
