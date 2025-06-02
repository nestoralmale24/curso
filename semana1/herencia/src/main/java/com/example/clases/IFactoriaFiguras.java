package com.example.clases;

public interface IFactoriaFiguras {
    Figura getInstance(TipoFigura tipo, int x, int y, int valor);
}
