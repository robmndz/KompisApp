package com.example.spring_initializr2.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data // Lombok
public class Kompis {

    @Id     // berättar att detta är nyckel-värdet för entiteten
    @GeneratedValue(strategy = GenerationType.AUTO)     // //default, persistence provider bestämmer hur nycklar genereras
    private Long id;
    private String namn;
    private String telefonnummer;

    // 3 olika 'Constructors'. Inte aktuellt ändå eftersom vi använder 'Lombok'.
    public Kompis() {
    }

    public Kompis(Long id, String namn, String telefonnummer) {
        this.id = id;
        this.namn = namn;
        this.telefonnummer = telefonnummer;
    }

    public Kompis(String namn, String telefonnummer) {
        this.namn = namn;
        this.telefonnummer = telefonnummer;
    }

    // Jag använder Lombok (@Data) och därför inte behövs setters & getters.
    // Setters & Getters

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNamn() {
//        return namn;
//    }
//
//    public void setNamn(String namn) {
//        this.namn = namn;
//    }
//
//    public String getTelefonnummer() {
//        return telefonnummer;
//    }
//
//    public void setTelefonnummer(String telefonnummer) {
//        this.telefonnummer = telefonnummer;
//    }

    // Eftersom jag använder Lombok (@Data) då är det inte aktuellt med toString method.
    // toString method
//    @Override
//    public String toString() {
//        return "Kompis{" +
//                "id=" + id +
//                ", namn='" + namn + '\'' +
//                ", telefonnummer='" + telefonnummer + '\'' +
//                '}';
//    }
}
