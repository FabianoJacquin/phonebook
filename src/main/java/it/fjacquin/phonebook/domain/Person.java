package it.fjacquin.phonebook.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person extends BaseEntity {

    @NotBlank(message = "Nome è un campo richiesto")
    private String nome;

    @NotBlank(message = "Cognome è un campo richiesto")
    private String cognome;

    private Date created_At;
    private Date updated_At;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private Set<Contact> contacts = new HashSet<>() ;

    public Person() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(Date updated_At) {
        this.updated_At = updated_At;
    }

    @PrePersist
    protected void onCreate(){
        this.created_At = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_At = new Date();
    }
}
