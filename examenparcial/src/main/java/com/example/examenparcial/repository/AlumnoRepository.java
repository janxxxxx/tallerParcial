package com.example.examenparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examenparcial.model.AlumnoModel;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {
}
