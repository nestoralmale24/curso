package com.example.clases.comparators;

import com.example.clases.Figura;

public class ComparadorSuperficie implements IFiguraComparador{

    @Override
    public int ordena(Figura figura1, Figura figura2) {
        return (int)(figura1.dameSuperficie()-figura2.dameSuperficie());
    }

}
