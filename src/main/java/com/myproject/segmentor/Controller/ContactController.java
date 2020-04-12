package com.myproject.segmentor.Controller;

import com.myproject.segmentor.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.myproject.segmentor.Beans.Contacts;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/addContact")
    public String insertContact(@RequestBody Contacts contact){
        contactRepository.save(contact);
        return "Added Contact with id:"+ contact.getId();
    }

    @PostMapping("/addContacts")
    public String insertContact(@RequestBody List<Contacts> contactsList){
        contactRepository.saveAll(contactsList);
        return "Contacts Added";
    }

    @GetMapping("/getContacts")
    public List<Contacts> getContacts(){
        return contactRepository.findAll();

    }

    @GetMapping("/getContactByFirstName/{name}")
    public List<Contacts> getContactByFirstName(@PathVariable String name){
        return contactRepository.findByFirstName(name);
    }

    @DeleteMapping("/removeContact/{id}")
    public String deleteContact(@PathVariable String id){
        contactRepository.deleteById(id);
        return "Contact with id"+ id+ ":deleted.";
    }
}
