package com.proyectofinal.proyectofinalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.proyectofinal.proyectofinalapi.model.Puntaje;
import java.util.Optional;

@Repository
public interface PuntajeRepository extends CrudRepository<Puntaje, String> {
    Optional<Puntaje> findByEmail(String email);
    Optional<Puntaje> findByContrasena(String contrasena);
}