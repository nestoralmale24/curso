package com.example.clases;

public class FiltrarPorSuperficie implements IPredicado{

    @Override
    public boolean filtrar(Figura MiFigura) {
        return (MiFigura.dameSuperficie()>24);
    }

}
