package com.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro();

        miLibro.escribir("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        miLibro.escribir("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        miLibro.escribir("linea nueva extra");

        File archivo = new File("libro.txt");
        try {
            miLibro.grabar(archivo);
            System.out.println("Libro grabado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al grabar el archivo: " + e.getMessage());
        }
        
        Libro libroLeido = new Libro();
        try {
            libroLeido.leer(archivo);
            System.out.println("Contenido leído:");
            for (String linea : libroLeido.getLineas()) {
                System.out.println(linea);
            }
           

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
