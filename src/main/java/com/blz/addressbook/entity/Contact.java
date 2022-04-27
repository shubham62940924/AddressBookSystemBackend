package com.blz.addressbook.entity;






import com.blz.addressbook.dto.ContactDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String zip;
    public String phone;
    public String email;
    public String password;


    public void Contact(ContactDTO contactDTO) {
        this.firstName = contactDTO.getFirstName();
        this.lastName = contactDTO.getLastName();
        this.address = contactDTO.getAddress();
        this.city = contactDTO.getCity();
        this.phone = contactDTO.getPhone();
        this.zip = contactDTO.getZip();
        this.state = contactDTO.getState();
        this.email = contactDTO.getEmail();
        this.password= contactDTO.getPassword();
    }
    public Contact(ContactDTO contactDTO){
        this.Contact(contactDTO);
    }


    public void updateContact(ContactDTO contactDTO) {
        this.firstName = contactDTO.getFirstName();
        this.lastName = contactDTO.getLastName();
        this.address = contactDTO.getAddress();
        this.city = contactDTO.getCity();
        this.phone = contactDTO.getPhone();
        this.zip = contactDTO.getZip();
        this.state = contactDTO.getState();
        this.email = contactDTO.getEmail();
        this.password = contactDTO.getPassword();
    }
}