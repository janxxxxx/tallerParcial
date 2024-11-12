package com.example.examenparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenparcial.model.AlumnoModel;
import com.example.examenparcial.repository.AlumnoRepository;

@Service
public class AlumnoService implements IAlumnoservice {
    
    @Autowired
    AlumnoRepository repository;

    @Override
    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>)repository.findAll();
    }

    @Override
    public AlumnoModel findById(Integer id) {
        return (AlumnoModel)repository.findById(id).get();
    }

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
    
        
    
}
