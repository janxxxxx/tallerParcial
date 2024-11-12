package com.example.examenparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examenparcial.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
