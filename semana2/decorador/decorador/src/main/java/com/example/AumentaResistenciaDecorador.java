package com.example;

public class AumentaResistenciaDecorador implements IPersonaje {

    private IPersonaje personaje;

    public AumentaResistenciaDecorador(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public int dameVelocidad() {
        return personaje.dameVelocidad();
    }

    @Override
    public int dameResistencia() {
       return personaje.dameResistencia() + 18;
    }
    
}
