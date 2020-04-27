package it.fjacquin.phonebook.web;

import it.fjacquin.phonebook.domain.Contact;
import it.fjacquin.phonebook.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("")
    public ResponseEntity<?> createNewContact(@RequestBody Contact contact){
        contactService.saveOrUpdateContact(contact);
        return new ResponseEntity<Contact>(contact, HttpStatus.OK);
    }

}
