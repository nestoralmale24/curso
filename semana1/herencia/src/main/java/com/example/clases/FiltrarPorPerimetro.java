package com.example.clases;

public class FiltrarPorPerimetro implements IPredicado{

    @Override
    public boolean filtrar(Figura MiFigura) {
        return MiFigura.damePerimetro() > 0;
    }

}
