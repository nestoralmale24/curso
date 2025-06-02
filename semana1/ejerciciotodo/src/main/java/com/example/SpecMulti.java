package com.example;

import java.util.ArrayList;

public class SpecMulti implements IFiltro{

    private ArrayList<IFiltro> Lista = new ArrayList();

    public void add (IFiltro Condicion)
    {
        Lista.add(Condicion);
    }
    @Override
    public boolean filtrar(Objetos MiFobjetoFiltro) {
        boolean correcto = true;
        for (IFiltro iFiltro : Lista) {
            if (iFiltro.filtrar(MiFobjetoFiltro))
            {
            } else {
                correcto = false;
            }
        }
        return correcto;
    }

}
