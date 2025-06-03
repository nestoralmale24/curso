package com.example;

public class Ninja implements IPersonaje{

    @Override
    public int dameVelocidad() {
        return 10;
    }

    @Override
    public int dameResistencia() {
        return 5;
    }
    
        @Override
    public String toString() {
        return "Ninja, velocidad: " + dameVelocidad() + "\n Ninja, resistencia: " + dameResistencia();
    }
}
