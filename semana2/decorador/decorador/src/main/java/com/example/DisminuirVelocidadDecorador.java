package com.example;

public class DisminuirVelocidadDecorador implements IPersonaje{

    IPersonaje personaje;
    
    public DisminuirVelocidadDecorador(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public int dameVelocidad() {
        return personaje.dameVelocidad() - 17;
    }

    @Override
    public int dameResistencia() {
        return personaje.dameResistencia();
    }
    
}
