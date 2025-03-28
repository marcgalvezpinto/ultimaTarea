package com.corporativoGalvez.proyectoTarea.controller;

import com.corporativoGalvez.proyectoTarea.model.Personaje;
import com.corporativoGalvez.proyectoTarea.service.PersonajeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Obtener todos los personajes", description = "Devuelve una lista de todos los personajes en la base de datos")
    public ResponseEntity<List<Personaje>> obtenerTodosLosPersonajes() {
        List<Personaje> personajes = personajeService.obtenerTodosLosPersonajes();
        return ResponseEntity.ok(personajes);
    }
}
