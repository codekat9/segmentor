package com.myproject.segmentor.Repository;


import com.myproject.segmentor.Beans.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends MongoRepository<Contacts, String> {

    List<Contacts> findByLastName(String lastName);
    List<Contacts> findByFirstName(String firstName);
}
