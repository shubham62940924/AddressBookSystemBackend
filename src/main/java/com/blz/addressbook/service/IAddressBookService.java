package com.blz.addressbook.service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.entity.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}




