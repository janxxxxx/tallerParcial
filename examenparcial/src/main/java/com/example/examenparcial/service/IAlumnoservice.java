package com.example.examenparcial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.examenparcial.model.AlumnoModel;

public interface IAlumnoservice {
    
    public List<AlumnoModel> findAll();

    public AlumnoModel findById(Integer id);

    public AlumnoModel add(AlumnoModel model);

    public AlumnoModel update(AlumnoModel model);

    public Boolean delete(Integer id);
    
}
