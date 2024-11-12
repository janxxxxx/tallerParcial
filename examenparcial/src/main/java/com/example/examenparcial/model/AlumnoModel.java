package com.example.examenparcial.model;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
public class AlumnoModel {
    @Id
    @Column(name="id")
    private Integer id;
    
    @Column(name="nombre")
    private String nombre;

    @Column(name="nota")
    private BigDecimal nota;

    // Getters y Setters
}


