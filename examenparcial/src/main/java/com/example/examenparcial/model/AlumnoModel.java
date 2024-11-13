package com.example.examenparcial.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumno")
public class AlumnoModel {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nota")
    private BigDecimal nota;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getNota() {
        return this.nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    // Getters y Setters
}
