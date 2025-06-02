package com.example;

public class FiltroPorPrecio implements IFiltro{

    @Override
    public boolean filtrar(Objetos miObjeto) {
        return (miObjeto.damePrecio()>=0);
    }

}
