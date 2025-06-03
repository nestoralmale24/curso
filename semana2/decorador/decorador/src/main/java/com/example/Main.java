package com.example;

public class Main {
    public static void main(String[] args) {
        var PoliciaDopao = new AumentaVelocidadDecorador(new AumentaResistenciaDecorador(new Policia()));
        
    }
}