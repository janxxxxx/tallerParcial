package com.example.examenparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examenparcial.model.AlumnoModel;

@Repository
public interface AlumnoRepository
                extends JpaRepository<AlumnoModel, Integer> {
}
