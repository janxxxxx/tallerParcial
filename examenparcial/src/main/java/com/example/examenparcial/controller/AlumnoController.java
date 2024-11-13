package com.example.examenparcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examenparcial.model.AlumnoModel;
import com.example.examenparcial.service.AlumnoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    // busqueda general
    @GetMapping("/getAll")
    public ResponseEntity<List<AlumnoModel>> findAll() {
        List<AlumnoModel> lista = alumnoService.findAll();
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/create")
    public ResponseEntity<AlumnoModel> create(@Valid @RequestBody AlumnoModel model) {
        AlumnoModel alumno = alumnoService.add(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(alumno);
    }

    @PutMapping("/update")
    public ResponseEntity<AlumnoModel> update(@Valid @RequestBody AlumnoModel model) {
        AlumnoModel alumno = alumnoService.update(model);
        return ResponseEntity.ok(alumno);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AlumnoModel> findById(@PathVariable int id) {
        AlumnoModel alumno = alumnoService.findById(id);
        if (alumno == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alumno);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        alumnoService.delete(id);
        return ResponseEntity.ok("Usuario eliminado con éxito");
    }
}
