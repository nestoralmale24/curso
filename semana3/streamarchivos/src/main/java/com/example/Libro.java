package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    private ArrayList<String> lineas;

    public Libro() {
        this.lineas = new ArrayList<>();
    }

    public void escribir(String linea) {
        lineas.add(linea);
    }

    public void grabar(File archivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }
        }
    }

    public void leer(File archivo) throws IOException {
        lineas.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        }
    }

    public ArrayList<String> getLineas() {
        return lineas;
    }
}
