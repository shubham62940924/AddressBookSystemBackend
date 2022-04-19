package com.blz.addressbook.service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.entity.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    /**
     * method for get contacts
     * @param contactId
     * @return
     */
    Contact getContactById(long contactId);

    /**
     * method for create contacts
     * @param contactDTO
     * @return
     */
    Contact createContact(ContactDTO contactDTO);

    /**
     * method for update contacts
     * @param contactId
     * @param contactDTO
     * @return
     */
    Contact updateContact(long contactId, ContactDTO contactDTO);

    /**
     * method for delete contacts
     * @param contactId
     */
    void deleteContact(long contactId);

    /**
     * calling city by using sql query
     * @param city
     * @return
     */
    List<Contact> findAddressBookDataByCity(String city);
}




