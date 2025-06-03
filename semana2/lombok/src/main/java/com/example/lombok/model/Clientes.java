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
    private String nombre;
    private float peso;

    float obtenerPeso(){
        return peso;
    };
}
