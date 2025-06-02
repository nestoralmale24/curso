package com.example;

public class FiltroPorValorArtistico implements IFiltro{

    @Override
    public boolean filtrar(Objetos miObjeto) {
        return (miObjeto.dameArtistico()>200);
    }

}
