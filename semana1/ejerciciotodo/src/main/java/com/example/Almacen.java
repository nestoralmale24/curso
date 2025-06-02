package com.example;

import java.util.ArrayList;

public class Almacen extends Objetos {

    private IEncargado encargado;
    private IFiltro filtro;
    private ArrayList<Objetos> misObjetos = new ArrayList<>();


    public Almacen(String nombre, int precio, double volumen, int valorArtistico, IEncargado encargado, IFiltro filtro) {
        super(nombre, precio, volumen, valorArtistico);
        this.encargado = encargado;
        this.filtro = filtro;
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

    public void muestraColeccion()
    {
        var misObjetosShow = misObjetos.stream().filter(this.filtro::filtrar);
        misObjetosShow.forEach(this.encargado::seEncarga);
    }

    public void add(Objetos[] objetos) {
        for (Objetos objetoMe : objetos) {
        misObjetos.add(objetoMe);
    }
    }

    @Override
    public String dameNombre() {
        return nombre;
    }
    
}
