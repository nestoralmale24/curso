package com.example.clases.specifications;

import com.example.clases.Figura;

public class FiltrarPorPerimetro implements IPredicado{

    @Override
    public boolean filtrar(Figura MiFigura) {
        return MiFigura.damePerimetro() > 0;
    }

}
