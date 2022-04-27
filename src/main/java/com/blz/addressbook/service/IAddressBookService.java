package com.blz.addressbook.service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.entity.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(long contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact addnewContact(ContactDTO contactDTO);

    Contact updateContact(long contactId, ContactDTO contactDTO);

    void deleteContact(long contactId);

    List<Contact> findAddressBookDataByCity(String city);

    boolean loginUser(String email, String password);

    String loginWithToken(String email, String password);
}