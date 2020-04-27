package it.fjacquin.phonebook.services;

import it.fjacquin.phonebook.domain.Person;
import it.fjacquin.phonebook.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person saveOrUpdatePerson(Person person){
        return  personRepository.save(person);
    }

}
