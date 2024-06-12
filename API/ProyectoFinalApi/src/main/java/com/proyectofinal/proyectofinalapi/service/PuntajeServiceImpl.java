package com.proyectofinal.proyectofinalapi.service;

import java.util.ArrayList;
import java.util.Optional;
import com.proyectofinal.proyectofinalapi.model.Puntaje;
import com.proyectofinal.proyectofinalapi.repository.PuntajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuntajeServiceImpl implements PuntajeService{
    static ArrayList<Puntaje> arrayPuntaje = new ArrayList<>();

    @Autowired
    PuntajeRepository puntajeRepository;

    @Override
    public ArrayList<Puntaje> getAllPuntaje() {return (ArrayList<Puntaje>) puntajeRepository.findAll();}

    @Override
    public Puntaje saveEmail(String email) {
        Puntaje puntaje = new Puntaje();
        puntaje.setEmail(email);
        return puntajeRepository.save(puntaje);
    }

    @Override
    public Puntaje getEmail(String email) {
        Optional<Puntaje> puntajeOpt = puntajeRepository.findByEmail(email);
        if (puntajeOpt.isPresent()) {
            return puntajeOpt.get();
        } else {
            throw new RuntimeException("No se encontró un Puntaje con el email proporcionado.");
        }
    }

    @Override
    public Puntaje getContrasena(String contrasena) {
        Optional<Puntaje> puntajeOpt = puntajeRepository.findByContrasena(contrasena);
        if (puntajeOpt.isPresent()) {
            return puntajeOpt.get();
        } else {
            throw new RuntimeException("No se encontró un Puntaje con la contraseña proporcionada.");
        }
    }

    @Override
    public Puntaje saveContrasena(String contrasena) {
        Puntaje puntaje = new Puntaje();
        puntaje.setContrasena(contrasena);
        return puntajeRepository.save(puntaje);
    }

    @Override
    public Optional<Puntaje> getPuntajeByEmail(String email) {
        return puntajeRepository.findById(email);
    }
    @Override
    public Puntaje savePuntaje(Puntaje p) {return puntajeRepository.save(p);}
    @Override
    public boolean deletePuntaje(String email) {
        try {
            Optional<Puntaje> a = getPuntajeByEmail(email);
            puntajeRepository.delete(a.get());
            return true;
        }catch (Exception ex){
            //logger.warn(ex.getMessage());
            return false;
        }
    }
}