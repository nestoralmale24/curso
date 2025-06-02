package com.example.clases;

import java.util.ArrayList;

public class CompositeSpecification implements IPredicado{

    private ArrayList<IPredicado> Lista = new ArrayList();

    public void add (IPredicado Condicion)
    {
        Lista.add(Condicion);
    }
    @Override
    public boolean filtrar(Figura MiFigura) {
        boolean correcto = true;
        for (IPredicado iPredicado : Lista) {
            if (!iPredicado.filtrar(MiFigura))
            {
                correcto = false;
            }
        }
        return correcto;
    }

}
