package com.example;

import java.io.File;
import java.io.IOException;

public class MainEj2 {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        int numCaracter = 0;
        Linea miLinea = new Linea("prueba 2 nestor", numCaracter);

        numCaracter = miLinea.texto.getBytes().length;
        System.out.println(numCaracter);


        miLibro.escribir(miLinea.texto);

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
