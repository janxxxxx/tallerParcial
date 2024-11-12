package com.example.examenparcial.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class AuthRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private BigDecimal nota;

    public AuthRequest() {

    }

    public AuthRequest(String nombre, BigDecimal nota) {
        this.nombre = nombre;
        this.nota = nota;
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

}
