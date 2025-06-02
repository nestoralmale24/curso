package com.example;

public class FiltroPorVolumen implements IFiltro{

    @Override
    public boolean filtrar(Objetos miObjeto) {
        return (miObjeto.dameVolumen()>=0.5);
    }

}
