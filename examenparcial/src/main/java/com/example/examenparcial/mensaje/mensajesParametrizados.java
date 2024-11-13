package com.example.examenparcial.mensaje;

public class mensajesParametrizados {

    // public static final String MENSAJE_AUTENTICACION_EXITOSA = "Autenticación
    // exitosa. Token:";
    // public static final String MENSAJE_ERROR_AUTENTICACION = "Error de
    // autenticación. Verifica tu nombre de usuario y contraseña.";
    public static final String MENSAJE_CREAR_ALUMNO_EXITOSO = "ALUMNO ALUMNO creado exitosamente.";
    public static final String MENSAJE_CREAR_ALUMNO_NOEXITOSO = "ALUMNO ALUMNO NO CREADO.";
    public static final String MENSAJE_ALUMNO_EXISTENTE = "ALUMNO - El ALUMNO ya existe";
    public static final String MENSAJE_ALUMNO_LISTADO = "ALUMNO - LISTADO EXITOSAMENTE";
    public static final String MENSAJE_ALUMNO_LISTADOID = "ALUMNO - BUSQUEDA ID EXITOSAMENTE";
    public static final String MENSAJE_ALUMNO_NO_ENCONTRADO = "ALUMNO - ALUMNO no encontrado:";
    public static final String MENSAJE_ALUMNO_NO_ENCONTRADOELIMINAR = "MSALUMNO - ALUMNO no encontrado a eliminar:";
    public static final String MENSAJE_ALUMNO_NO_ENCONTRADO_ID = "ALUMNO - ALUMNO no encontrado: ";
    public static final String MENSAJE_ALUMNO_EDITADO_EXITOSO = "ALUMNO - ALUMNO editado exitosamente";
    public static final String MENSAJE_ERROR_BASE_DATOS = "ALUMNO - Error en la base de datos: ";
    public static final String MENSAJE_ERROR_INTERNO_SERVIDOR = "ALUMNO - Error interno del servidor: ";
    public static final String MENSAJE_ELIMINAR_ALUMNO_EXITOSO = "ALUMNO - ALUMNO eliminado exitosamente";
    public static final String MENSAJE_ERROR = "ALUMNO - Error ";

    public static String usuarioNoEncontrado(String nombreUsuario) {
        return String.format(MENSAJE_ALUMNO_NO_ENCONTRADO, nombreUsuario);
    }

    public static String usuarioNoEncontradoPorId(int id) {
        return MENSAJE_ALUMNO_NO_ENCONTRADO_ID.replace("{}", String.valueOf(id));
    }

    public static String errorBaseDatos(String mensajeError) {
        return MENSAJE_ERROR_BASE_DATOS.replace("{}", mensajeError);
    }

    public static String errorServidor(String mensajeError) {
        return MENSAJE_ERROR_INTERNO_SERVIDOR.replace("{}", mensajeError);
    }
}
