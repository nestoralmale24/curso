package com.example;

public class Artista implements IEncargado{

    @Override
    public void seEncarga(Objetos misObjetos) {
        System.out.println(misObjetos.dameNombre()+": " + misObjetos.dameArtistico() + " " + misObjetos.dameVolumen());
    }
}
