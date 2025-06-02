package com.example.clases;

public class ConsumidorDavid implements IConsumidor{

    @Override
    public void consume(Figura MiFigura) {
        System.out.println("La superficie: "+MiFigura.dameSuperficie());
    }

}
