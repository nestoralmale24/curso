package com.example;

import com.example.clases.Cuadrado;
import com.example.clases.Panel;
import com.example.clases.TipoFigura;
import com.example.clases.comparators.ComparadorSuperficie;
import com.example.clases.comparators.IFiguraComparador;
import com.example.clases.consumers.ConsumidorJacinto;
import com.example.clases.consumers.IConsumidor;
import com.example.clases.factorias.FactoriaJacinto;
import com.example.clases.specifications.AndSpecification;
import com.example.clases.specifications.CompositeSpecification;
import com.example.clases.specifications.FiltrarPorPerimetro;
import com.example.clases.specifications.FiltrarPorSuperficie;
import com.example.clases.specifications.IPredicado;
import com.example.clases.specifications.OrSpecification;
public class Main {
    public static void main(String[] args) {
        var filtroMultiple = new CompositeSpecification();
        IConsumidor miConsumidor = new ConsumidorJacinto();
        IFiguraComparador miComparador = new ComparadorSuperficie();
        IPredicado miFiltro = new FiltrarPorSuperficie();
        IPredicado miFiltro2 = new FiltrarPorPerimetro();
        var factoria = new FactoriaJacinto(miFiltro);
        OrSpecification miFiltro3 = new OrSpecification(miFiltro, miFiltro2);
        AndSpecification miFiltro4 = new AndSpecification(miFiltro2, miFiltro3);
        filtroMultiple.add(miFiltro);
        filtroMultiple.add(miFiltro2);
        filtroMultiple.add(miFiltro3);
        filtroMultiple.add(miFiltro4);
        Panel miPanel = new Panel(9,10,miConsumidor,filtroMultiple,miComparador);
        var miFigura = factoria.getInstance(TipoFigura.Circulo, 6, 5, 5); 
        if (miFigura != null)
            miPanel.add(miFigura);
        factoria.setMiFiltro(miFiltro4);

        miPanel.add(factoria.getInstance(TipoFigura.Cuadrado, 5,4,5));
      
        miPanel.muestraColeccion();
        Panel miPanel2 = new Panel(10,12,miConsumidor,miFiltro,miComparador);
        miPanel2.add(new Cuadrado(6,6,6));
        miPanel2.add(miPanel);
    }
}