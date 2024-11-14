package com.example.examenparcial.service;

import java.util.List;
import java.util.Optional;

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
    public AlumnoModel add(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Optional<AlumnoModel> findById(int id) {
        // Devuelve el resultado del repositorio, que es un Optional<AlumnoModel>
        return alumnoRepository.findById(id);
    }

    @Override
    public AlumnoModel update(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Boolean delete(int id) {
        alumnoRepository.deleteById(id);
        return true;
    }

}
