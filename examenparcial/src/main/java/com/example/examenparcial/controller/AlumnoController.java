package com.example.examenparcial.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

import com.example.examenparcial.endpoints.Endpoints; // Cambiar la importación aquí
import com.example.examenparcial.model.AlumnoModel;
import com.example.examenparcial.service.AlumnoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(Endpoints.BASE_PATH) // Usar la constante BASE_PATH
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    // Buscar todos los alumnos
    @GetMapping(Endpoints.LISTAR) // Usar la constante LISTAR
    public ResponseEntity<Map<String, Object>> findAll() {
        List<AlumnoModel> lista = alumnoService.findAll();

        // Crear un Map para incluir el mensaje y la lista
        Map<String, Object> response = new HashMap<>();
        response.put("Lista de todos los alumnos existentes", lista);
        return ResponseEntity.ok(response);
    }

    // Crear nuevo alumno
    @PostMapping(Endpoints.CREATE) // Usar la constante CREATE
    public ResponseEntity<String> create(@Valid @RequestBody AlumnoModel model) {
        try {
            // Verificar si el alumno ya existe por su ID
            Optional<AlumnoModel> existingAlumno = alumnoService.findById(model.getId());
            if (existingAlumno.isPresent()) { // Verifica si el alumno ya existe
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Alumno ya existente. No se puede registrar.");
            }

            // Guardar el nuevo alumno
            alumnoService.add(model);
            return ResponseEntity.status(HttpStatus.CREATED).body("Alumno registrado con éxito.");

        } catch (Exception e) {
            // Manejo de excepciones generales
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear el alumno: " + e.getMessage());
        }
    }

    // Editar un alumno
    @PutMapping(Endpoints.UPDATE) // Usar la constante UPDATE
    public ResponseEntity<Map<String, Object>> update(@Valid @RequestBody AlumnoModel model) {
        try {
            AlumnoModel alumno = alumnoService.update(model);
            // Crear el Map para incluir el mensaje de éxito y el alumno editado
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "Alumno editado con éxito");
            response.put("alumno", alumno);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // Manejo de excepciones si algo falla
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("mensaje", "Error al editar el alumno");
            errorResponse.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    // Buscar por ID
    @GetMapping(Endpoints.GET)
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Optional<AlumnoModel> alumnoOptional = alumnoService.findById(id);
        if (alumnoOptional.isPresent()) {
            // Si el alumno existe, devuelve el alumno
            return ResponseEntity.ok(alumnoOptional.get());
        } else {
            // Si el alumno no existe, devuelve un 404 Not Found con un mensaje
            Map<String, String> response = new HashMap<>();
            response.put("mensaje", "El alumno con ID " + id + " no existe.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    // Eliminar un alumno por ID
    @DeleteMapping(Endpoints.DELETE) // Usar la constante DELETE
    public ResponseEntity<String> delete(@PathVariable int id) {
        try {
            // Verificar si el alumno existe usando Optional
            Optional<AlumnoModel> alumnoOpt = alumnoService.findById(id);
            // Si el alumno no existe
            if (!alumnoOpt.isPresent()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Alumno no existente. No se puede eliminar.");
            }
            // Si el alumno existe, proceder a eliminarlo
            alumnoService.delete(id);

            // Retornar mensaje de éxito
            return ResponseEntity.status(HttpStatus.OK)
                    .body("Alumno eliminado con éxito.");
        } catch (Exception e) {
            // Manejo de excepciones generales
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al eliminar el alumno: " + e.getMessage());
        }
    }

}
