package com.blz.addressbook.service;

import com.blz.addressbook.dto.ContactDTO;
import com.blz.addressbook.entity.Contact;
import com.blz.addressbook.exceptions.AddressBookExceptions;
import com.blz.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {


        @Autowired
        AddressBookRepository addressBookRepository;
        /**
         * Service method for Getting All Contact Data
         * @return
         */
        @Override
        public List<Contact> getContact() {

            return addressBookRepository.findAll();
        }

        /**
         *GFet contact by id
         * @param contactId
         * @return
         */
        @Override
        public Contact getContactById(long contactId) {

            return addressBookRepository.findById(contactId).
                    orElseThrow(() -> new AddressBookExceptions("Contact Not Found"));
        }

        /**
         *create contact
         * @param contactDTO
         * @return
         */
        @Override
        public Contact createContact(ContactDTO contactDTO) {
            Contact contact = new Contact(contactDTO);
            return addressBookRepository.save(contact);
        }

        /**
         *update contact details
         * @param contactId
         * @param contactDTO
         * @return
         */
        @Override
        public Contact updateContact(long contactId, ContactDTO contactDTO) {
            Contact contact = this.getContactById(contactId);
            contact.Contact(contactDTO);
            return addressBookRepository.save(contact);
        }

        /**
         *Deleted contact
         * @param contactId
         */
        @Override
        public void deleteContact(long contactId) {
            Contact contact = this.getContactById(contactId);
            addressBookRepository.delete(contact);
        }

    /**
     * calling city by using sql
     * @param city
     * @return
     */
    @Override
        public List<Contact> findAddressBookDataByCity(String city) {
            return addressBookRepository.findAddressBookDataByCity(city);
        }
    }