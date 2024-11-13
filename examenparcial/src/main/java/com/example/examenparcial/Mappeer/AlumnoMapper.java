package com.example.examenparcial.Mappeer;

import org.springframework.stereotype.Component;

import com.example.examenparcial.dto.AuthRequest;
import com.example.examenparcial.model.AlumnoModel;

@Component
public class AlumnoMapper {
    // Método para convertir una entidad AlumnoModel a un DTO AuthRequest
    public AuthRequest entityToDto(AlumnoModel alumnoModel) {
        AuthRequest dto = new AuthRequest();
        dto.setId(alumnoModel.getId());
        dto.setNombre(alumnoModel.getNombre());
        dto.setNota(alumnoModel.getNota()); // Asignar la nota al DTO
        return dto;
    }

    // Método para convertir un DTO AuthRequest a una entidad AlumnoModel
    public AlumnoModel dtoToEntity(AuthRequest dto) {
        AlumnoModel alumnoModel = new AlumnoModel();
        alumnoModel.setId(dto.getId());
        alumnoModel.setNombre(dto.getNombre());
        alumnoModel.setNota(dto.getNota()); // Asignar la nota a la entidad
        return alumnoModel;
    }
}
