package com.corporativoGalvez.proyectoTarea.service;

import com.corporativoGalvez.proyectoTarea.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeService {


        Personaje guardarPersonaje(Personaje personaje);
        Optional<Personaje> buscarPorIdentificador(String identificador);
        List<Personaje> obtenerTodosLosPersonajes();  // Nuevo método

}

