package com.example.examenparcial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.examenparcial.model.AlumnoModel;

@Repository
public interface AlumnoRepository
        extends CrudRepository<AlumnoModel, Integer> {
}
