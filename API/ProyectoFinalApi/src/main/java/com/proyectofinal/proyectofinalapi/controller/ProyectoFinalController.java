package com.proyectofinal.proyectofinalapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;
import com.proyectofinal.proyectofinalapi.model.Puntaje;
import com.proyectofinal.proyectofinalapi.service.PuntajeService;


@CrossOrigin
@RestController
@RequestMapping("puntaje")
public class ProyectoFinalController {
    @Autowired
    PuntajeService puntajeService;
    @GetMapping("/all")
    public ArrayList<Puntaje> getAllPuntaje(){
        return puntajeService.getAllPuntaje();
    }

    @PostMapping("/savePuntaje")
    public Puntaje savePuntaje(@RequestBody Puntaje p){

        return puntajeService.savePuntaje(p);
    }

    @PostMapping("/saveEmail/{email}")
    public Puntaje saveEmail(@PathVariable("email") String email){

        return puntajeService.saveEmail(email);
    }

    @GetMapping("/getEmail/{email}")
    public Puntaje getEmail(@PathVariable("email") String email) {
        return puntajeService.getEmail(email);
    }

    @GetMapping("/getContrasena/{contrasena}")
    public Puntaje getContrasena(@PathVariable("contrasena") String contrasena) {
        return puntajeService.getContrasena(contrasena);
    }


    @PostMapping("/saveContrasena/{contrasena}")
    public Puntaje saveContrasena(@PathVariable("contrasena") String contrasena){

        return puntajeService.saveContrasena(contrasena);
    }

    @GetMapping("/find/{email}")
    public Optional<Puntaje> getPuntajeByEmail(@PathVariable("email") String email){
        return puntajeService.getPuntajeByEmail(email);
    }

    @DeleteMapping("delete/{email}")
    public  boolean deletePuntaje(@PathVariable("email") String email){
        if (getPuntajeByEmail(email).isEmpty()){
            return false;
        }
        return puntajeService.deletePuntaje(email);
    }

    @PutMapping("/update")
    public String updatePuntaje(@RequestBody Puntaje p){
        puntajeService.savePuntaje(p);
        return HttpStatus.OK.toString();

    }
}
