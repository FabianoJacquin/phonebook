package it.fjacquin.phonebook.services;

import it.fjacquin.phonebook.domain.Contact;
import it.fjacquin.phonebook.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveOrUpdateContact(Contact contact){
        return contactRepository.save(contact);
    }

}
