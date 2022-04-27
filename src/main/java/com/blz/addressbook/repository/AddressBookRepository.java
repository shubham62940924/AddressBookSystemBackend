package com.blz.addressbook.repository;

import com.blz.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends JpaRepository<Contact,Long> {


//    @Query(value = "select * from addressbook where city = :city",nativeQuery = true)
//    List<Contact> findAddressBookDataByCity(String city);
    // List<Contact> findContactsByCity(String city);

    //  boolean existsByEmailAndPassword(String email, String Password);

    // Contact findByEmailIdAndPassword(String email, String Password);

    //Optional<Contact> findPasswordByEmailId(String email);
    @Query(value = "select * from contact where email=:email", nativeQuery = true)
    Contact findPersonByEmail(String email);

    // Optional<Contact> findPasswordById(String email);
    Contact findContactByEmail(String email);
}
