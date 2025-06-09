package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.datos.Numeros;

public class MainPromedio {
	public static void main(String[] args) {
    List<Numeros> listaNumeros = new ArrayList<>();

        for(int i = 0; i < 1; i++){
            listaNumeros.add(new Numeros(1));
            listaNumeros.add(new Numeros(4));
            listaNumeros.add(new Numeros(6));
            listaNumeros.add(new Numeros(8));
            listaNumeros.add(new Numeros(11));
            listaNumeros.add(new Numeros(133));
        }
        System.out.println("Lista de números:");
        
        for (Numeros num : listaNumeros) {
            System.out.println(num.getNumero());
        }

        double promedio = listaNumeros.stream().mapToDouble(Numeros::getNumero).average().orElse(0);


        System.out.println("Promedio: " + promedio);
    }
}