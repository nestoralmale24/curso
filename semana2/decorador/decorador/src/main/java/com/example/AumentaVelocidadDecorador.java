package com.example;

public class AumentaVelocidadDecorador implements IPersonaje {

    private IPersonaje personaje;

    public AumentaVelocidadDecorador(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public int dameVelocidad() {
        return personaje.dameVelocidad() + 10;
    }

    @Override
    public int dameResistencia() {
        return personaje.dameResistencia();
    }
    
}
