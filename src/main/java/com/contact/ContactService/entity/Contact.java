package com.contact.ContactService.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Contact {

    private Long cId ;
    private String email ;
    private String contactName ;
    private int userId ;
}
