package com.example.examenparcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("alumno")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/findAll")
    public List<AlumnoModel> FindAll() {
        List<AlumnoModel> lista = alumnoService.findAll();
        return lista;
    }

    @PostMapping("/create")
    public AlumnoModel create(@RequestBody AlumnoModel model) {
        return alumnoService.add(model);
    }

    @PutMapping("/update")
    public AlumnoModel update(@RequestBody AlumnoModel model) {
        return alumnoService.update(model);
    }

    @GetMapping("/find/{id}")
    public AlumnoModel findById(@PathVariable Integer id) {
        return alumnoService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        alumnoService.delete(id);
        return ResponseEntity.ok("Usuario eliminado con éxito");
    }

}
