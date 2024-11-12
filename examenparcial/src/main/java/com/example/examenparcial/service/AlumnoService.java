package com.example.examenparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenparcial.model.AlumnoModel;
import com.example.examenparcial.repository.AlumnoRepository;

@Service
public class AlumnoService implements IAlumnoservice {

    @Autowired
    AlumnoRepository alumnoRepositoryrepository;

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return alumnoRepositoryrepository.save(model);
    }

    @Override
    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>) alumnoRepositoryrepository.findAll();
    }

    @Override
    public AlumnoModel findById(int id) {
        return (AlumnoModel) alumnoRepositoryrepository.findById(id).get();
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return alumnoRepositoryrepository.save(model);
    }

    @Override
    public Boolean delete(int id) {
        alumnoRepositoryrepository.deleteById(id);
        return true;
    }

}
