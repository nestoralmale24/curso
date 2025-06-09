package com.example.clases.consumers;

import com.example.clases.Figura;

public class ConsumidorJacinto implements IConsumidor{

    @Override
    public void consume(Figura MiFigura) {
        System.out.println(MiFigura.getClass()+": "+MiFigura.dameSuperficie());
    }

}
