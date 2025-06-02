package com.example;

public abstract class Objetos {
    public String nombre;
    public int precio;
    public double volumen;
    public int valorArtistico;

    public Objetos(String nombre, int precio, double volumen, int valorArtistico) {
        this.nombre = nombre;
        this.precio = precio;
        this.volumen = volumen;
        this.valorArtistico = valorArtistico;
    }

    public abstract String dameNombre();
    public abstract int damePrecio();
    public abstract double dameVolumen();
    public abstract int dameArtistico();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Objetos{");
        sb.append("precio=").append(precio);
        sb.append(", volumen=").append(volumen);
        sb.append(", valorArtistico=").append(valorArtistico);
        sb.append('}');
        return sb.toString();
    }
}
