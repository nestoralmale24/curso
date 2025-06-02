package com.example;

public class Contable implements IEncargado{

    @Override
    public void seEncarga(Objetos misObjetos) {
        System.out.println(misObjetos.dameNombre()+": " + misObjetos.damePrecio());
    }
}
