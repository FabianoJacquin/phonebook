package it.fjacquin.phonebook.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contact extends BaseEntity {

    private String numTelAbitazione;
    private String numCellulare;
    private String numAbbreviato;
    private String numRadio;
    private String mailAziendale;

    private Date created_At;
    private Date updated_At;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Contact() {
    }

    public String getNumTelAbitazione() {
        return numTelAbitazione;
    }

    public void setNumTelAbitazione(String numTelAbitazione) {
        this.numTelAbitazione = numTelAbitazione;
    }

    public String getNumCellulare() {
        return numCellulare;
    }

    public void setNumCellulare(String numCellulare) {
        this.numCellulare = numCellulare;
    }

    public String getNumAbbreviato() {
        return numAbbreviato;
    }

    public void setNumAbbreviato(String numAbbreviato) {
        this.numAbbreviato = numAbbreviato;
    }

    public String getNumRadio() {
        return numRadio;
    }

    public void setNumRadio(String numRadio) {
        this.numRadio = numRadio;
    }

    public String getMailAziendale() {
        return mailAziendale;
    }

    public void setMailAziendale(String mailAziendale) {
        this.mailAziendale = mailAziendale;
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
