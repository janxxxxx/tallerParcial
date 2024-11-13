package com.example.examenparcial.service;

import java.util.List;

import com.example.examenparcial.model.AlumnoModel;

public interface IAlumnoservice {

    public List<AlumnoModel> findAll();

    public AlumnoModel findById(int id);

    public AlumnoModel add(AlumnoModel alumno);

    public AlumnoModel update(AlumnoModel alumno);

    public Boolean delete(int id);

}
