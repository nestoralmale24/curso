package com.example.clases;

public class ConsumidorJacinto implements IConsumidor{

    @Override
    public void consume(Figura MiFigura) {
        System.out.println(MiFigura.getClass()+": "+MiFigura.dameSuperficie());
    }

}
