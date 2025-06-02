package com.example;

public class Ceramica extends Objetos{

    public Ceramica(String nombre, int precio, double volumen, int valorArtistico) {
        super(nombre, precio, volumen, valorArtistico);
    }

    @Override
    public int damePrecio() {
        return precio;
    }

    @Override
    public double dameVolumen() {
        return volumen;
    }
    @Override
    public int dameArtistico() {
        return valorArtistico;
    }

    @Override
    public String dameNombre() {
        return nombre;
    }
    
}
