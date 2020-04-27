package it.fjacquin.phonebook.repositories;

import it.fjacquin.phonebook.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
