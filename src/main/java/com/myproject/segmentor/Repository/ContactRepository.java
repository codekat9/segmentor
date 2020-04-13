package com.myproject.segmentor.Repository;


import com.myproject.segmentor.Beans.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ContactRepository extends MongoRepository<Contacts, String> {

    List<Contacts> findByLastName(String lastName);
    List<Contacts> findByFirstName(@Param("firstname") String firstname);
}
