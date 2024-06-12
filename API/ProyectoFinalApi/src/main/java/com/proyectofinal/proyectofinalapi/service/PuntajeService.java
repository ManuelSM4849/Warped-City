package com.proyectofinal.proyectofinalapi.service;
import com.proyectofinal.proyectofinalapi.model.Puntaje;

import java.util.ArrayList;
import java.util.Optional;

public interface PuntajeService {
    public ArrayList<Puntaje> getAllPuntaje();
    public Puntaje saveEmail(String email);
    public Puntaje saveContrasena(String contrasena);
    public Optional<Puntaje> getPuntajeByEmail(String email);
    public Puntaje savePuntaje(Puntaje p);
    public boolean deletePuntaje(String email);
    public Puntaje getEmail(String email);
    public Puntaje getContrasena(String contrasena);
}

