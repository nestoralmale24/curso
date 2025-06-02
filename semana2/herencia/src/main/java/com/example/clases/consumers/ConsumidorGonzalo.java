package com.example.clases.consumers;

import com.example.clases.Figura;

public class ConsumidorGonzalo implements IConsumidor {

    @Override
    public void consume(Figura MiFigura) {
       System.out.println(MiFigura.getClass());
    }

}
