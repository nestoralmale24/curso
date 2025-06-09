package com.example;

import java.io.Serializable;

public class Linea implements Serializable {
    public String texto;
    public int numCaracteres;

    public Linea(String texto, int numCaracteres) {
        this.texto = texto;
        this.numCaracteres = numCaracteres;
    }
}
