package com.example;

public class Almacenero implements IEncargado{

    @Override
    public void seEncarga(Objetos misObjetos) {
        System.out.println(misObjetos.dameNombre()+": " + misObjetos.dameVolumen());
    }
}
