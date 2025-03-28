package com.corporativoGalvez.proyectoTarea.service;

import com.corporativoGalvez.proyectoTarea.model.Personaje;
import com.corporativoGalvez.proyectoTarea.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public Personaje guardarPersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @Override
    public Optional<Personaje> buscarPorIdentificador(String identificador) {
        return personajeRepository.findById(Long.valueOf(identificador));
    }

    @Override
    public List<Personaje> obtenerTodosLosPersonajes() {
        return personajeRepository.findAll();  // Devuelve la lista de personajes
    }
}
