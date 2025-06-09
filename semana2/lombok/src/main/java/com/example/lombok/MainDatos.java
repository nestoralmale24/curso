package com.example.lombok;

import java.util.ArrayList;
import java.util.List;

import com.example.lombok.datos.Direccion;
import com.example.lombok.datos.Persona;

public class MainDatos {
    List<Persona> listaPersonas = new ArrayList<>();

    public MainDatos(){
        for(int i = 0; i < 100; i++){
            Direccion miDireccion = new Direccion();
            miDireccion.calle = "San jose";
            miDireccion.ciudad = "Zaragoza";
            miDireccion.numero = i;

            Persona persona1 = new Persona();
            persona1.edad = i + 20;
            persona1.nombre = "Mariano";
            listaPersonas.add(persona1);
        }

        var coleccionEnteros = listaPersonas.stream().mapToInt(x -> x.edad);
      
        listaPersonas.add(new Persona());

        var suma = 0;

        for(var entero : coleccionEnteros.toArray()){
            suma+=entero;
        }

}
}
