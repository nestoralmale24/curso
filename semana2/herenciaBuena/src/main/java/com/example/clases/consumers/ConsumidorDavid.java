package com.example.clases.consumers;

import com.example.clases.Figura;

public class ConsumidorDavid implements IConsumidor{

    @Override
    public void consume(Figura MiFigura) {
        System.out.println("La superficie: "+MiFigura.dameSuperficie());
    }

}
