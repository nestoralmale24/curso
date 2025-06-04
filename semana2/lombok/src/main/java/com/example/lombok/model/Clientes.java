package com.example.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Clientes {
    private int edad;
    private float peso;
    private String nombre;

    float obtenerPeso(){
        return peso;
    };
}
