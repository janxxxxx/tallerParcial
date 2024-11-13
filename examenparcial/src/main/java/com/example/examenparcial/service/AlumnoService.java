package com.example.examenparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenparcial.model.AlumnoModel;
import com.example.examenparcial.repository.AlumnoRepository;

@Service
public class AlumnoService implements IAlumnoservice {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>) alumnoRepository.findAll();
    }

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return alumnoRepository.save(model);
    }

    @Override
    public AlumnoModel findById(int id) {
        return (AlumnoModel) alumnoRepository.findById(id).get();
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return alumnoRepository.save(model);
    }

    @Override
    public Boolean delete(int id) {
        alumnoRepository.deleteById(id);
        return true;
    }

}
