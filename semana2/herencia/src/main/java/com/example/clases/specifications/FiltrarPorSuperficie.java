package com.example.clases.specifications;

import com.example.clases.Figura;

public class FiltrarPorSuperficie implements IPredicado{

    @Override
    public boolean filtrar(Figura MiFigura) {
        return (MiFigura.dameSuperficie()>24);
    }

}
