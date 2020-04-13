package com.myproject.segmentor.Controller;

import com.myproject.segmentor.Repository.ContactRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.myproject.segmentor.Beans.Contacts;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/")
    @ApiOperation(value = "Add new Contact(s) via this API",
            notes = "Adds all the contact mentioned in the body of the POST request.",
            response = Contacts.class)
    public String insertContact(@RequestBody List<Contacts> contactsList){
        contactRepository.saveAll(contactsList);
        return "Contacts Added";
    }

    @GetMapping("/")
    @ApiOperation(value = "Get all contacts",
            notes = "Gets all the contacts stored in the application",
            response = Contacts.class)
    public List<Contacts> getContacts(){
        return contactRepository.findAll();

    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get contact with matching id",
            notes = "Gets a single contact stored in the application with the matching id.",
            response = Contacts.class)
    public Optional<Contacts> getContactById(@PathVariable String id){
        return contactRepository.findById(id);
    }

}
