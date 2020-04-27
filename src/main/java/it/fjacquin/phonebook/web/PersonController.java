package it.fjacquin.phonebook.web;

import it.fjacquin.phonebook.domain.Person;
import it.fjacquin.phonebook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("")
    public ResponseEntity<?> createNewPerson (@RequestBody Person person){

        personService.saveOrUpdatePerson(person);
        return new ResponseEntity<Person>(person, HttpStatus.OK);

    }

}
