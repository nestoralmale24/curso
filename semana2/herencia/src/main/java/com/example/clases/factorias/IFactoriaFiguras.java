package com.example.clases.factorias;

import com.example.clases.Figura;
import com.example.clases.TipoFigura;

public interface IFactoriaFiguras {
    Figura getInstance(TipoFigura tipo,int x, int y, int valor);
}
