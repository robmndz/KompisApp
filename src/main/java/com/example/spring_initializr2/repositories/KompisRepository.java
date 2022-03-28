package com.example.spring_initializr2.repositories;

import com.example.spring_initializr2.models.Kompis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface KompisRepository extends CrudRepository<Kompis, Long> {

    // Specifika metoder:
    List<Kompis> findByNamn(String namn);
    List<Kompis> findByTelefonnummer(String telefonnummer);
    List<Kompis> findByNamnAndTelefonnummer(String namn, String telefonnummer);
}



/*
ANTECKNING gällande 'CrudRepository'

CrudRepository innehåller bl.a. följande metoder:
• count()
• delete (T entity)
• deleteById(int it)
• findAll()
• findById(int id)
• save(T entity)
*/
