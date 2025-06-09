package com.example.clases.specifications;

import java.util.ArrayList;

import com.example.clases.Figura;

public class CompositeSpecification implements IPredicado{

    private ArrayList<IPredicado> lista = new ArrayList<>();

    public void add (IPredicado condicion)
    {
        lista.add(condicion);
    }
    @Override
    public boolean filtrar(Figura miFigura) {
        boolean correcto = true;
        for (IPredicado iPredicado : lista) {
            if (!iPredicado.filtrar(miFigura))
            {
                correcto = false;
            }
        }
        return correcto;
    }

}
