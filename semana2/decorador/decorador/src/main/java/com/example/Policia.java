package com.example;

public class Policia implements IPersonaje{

    @Override
    public int dameVelocidad() {
        return 5;
    }

    @Override
    public int dameResistencia() {
        return 10;
    }

    @Override
    public String toString() {
        return "Policia, velocidad: " + dameVelocidad() + "\n Policia, resistencia: " + dameResistencia();
    }
    
}
