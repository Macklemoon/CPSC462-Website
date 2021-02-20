package com.example.cat1;



import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface userNameRepository extends MongoRepository<UserName, String> {

    List<UserName> findByFirstName(String firstName);
    List<UserName> findByLastName(String lastName);
    List<UserName> findBy_email(String _email);
    List<UserName> findByCity(String city );
    List<UserName> findByState(String state );
    List<UserName> findByZipCode(int zipCode );
    List<UserName> findByAddress(String address );
}