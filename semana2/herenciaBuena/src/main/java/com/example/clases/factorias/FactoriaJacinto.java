package com.example.clases.factorias;

import com.example.clases.Circulo;
import com.example.clases.Cuadrado;
import com.example.clases.Figura;
import com.example.clases.TipoFigura;
import com.example.clases.TrianguloEquilatero;
import com.example.clases.specifications.IPredicado;

public class FactoriaJacinto implements IFactoriaFiguras{

    private IPredicado miFiltro;
    
    public void setMiFiltro(IPredicado miFiltro) {
        this.miFiltro = miFiltro;
    }

    public FactoriaJacinto(IPredicado miFiltro) {
        this.miFiltro = miFiltro;
    }

    @Override
    public Figura getInstance(TipoFigura tipo, int x, int y, int valor) {
        Figura miFigura = null;
        switch (tipo) {
            case Cuadrado:
                miFigura = new Cuadrado(valor,x,y);
                break;
            case Circulo:
                miFigura = new Circulo(valor, x, y);
                break;
            case Triangulo:
                miFigura = new TrianguloEquilatero(valor, x, y);
                break;
            default:
                miFigura = null;
        }
        if (miFigura == null || miFiltro.filtrar(miFigura))
        {
            return miFigura;
        }
        else
        {
            return null;
        }
    }

}
