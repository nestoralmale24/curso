package com.example.clases;

public class ConsumidorGonzalo implements IConsumidor {

    @Override
    public void consume(Figura MiFigura) {
       System.out.println(MiFigura.getClass());
    }

}
