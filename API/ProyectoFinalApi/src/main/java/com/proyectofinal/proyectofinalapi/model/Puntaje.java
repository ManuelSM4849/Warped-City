package com.proyectofinal.proyectofinalapi.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="puntaje")
public class Puntaje {
    @Id
    @NonNull @Getter @Setter private String email;
    @NonNull @Getter @Setter private String nombre;
    @NonNull @Getter @Setter private String contrasena;
    @NonNull @Getter @Setter private int puntos;
}
