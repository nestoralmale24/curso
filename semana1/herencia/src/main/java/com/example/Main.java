package com.example;

import com.example.clases.AndSpecification;
import com.example.clases.CompositeSpecification;
import com.example.clases.ConsumidorJacinto;
import com.example.clases.Cuadrado;
import com.example.clases.FactoriaFiguras;
import com.example.clases.FactoriaJacinto;
import com.example.clases.FiltrarPorPerimetro;
import com.example.clases.FiltrarPorSuperficie;
import com.example.clases.IConsumidor;
import com.example.clases.IPredicado;
import com.example.clases.OrSpecification;
import com.example.clases.Panel;
import com.example.clases.TipoFigura;
public class Main {
    public static void main(String[] args) {

        var filtroMultiple = new CompositeSpecification();
        IConsumidor miConsumidor = new ConsumidorJacinto();
        IPredicado miFiltro = new FiltrarPorSuperficie();
        IPredicado miFiltro2 = new FiltrarPorPerimetro();
        var Factoria = new FactoriaJacinto(miFiltro);
        OrSpecification miFiltro3 = new OrSpecification(miFiltro, miFiltro2);
        AndSpecification miFiltro4 = new AndSpecification(miFiltro2, miFiltro3);
        filtroMultiple.add(miFiltro);
        filtroMultiple.add(miFiltro2);
        filtroMultiple.add(miFiltro3);
        filtroMultiple.add(miFiltro4);
        Panel miPanel = new Panel(9,10,miConsumidor,filtroMultiple);

        miPanel.add(FactoriaFiguras.getFactoryShapeReflexion("Cuadrado"));
        var miFigura = Factoria.getInstance(TipoFigura.Circulo, 6, 5, 5); 
        if (miFigura != null)
            miPanel.add(miFigura);
        Factoria.setMiFiltro(miFiltro4);

        miPanel.add(Factoria.getInstance(TipoFigura.Cuadrado, 5,4,5));
      
        miPanel.muestraColeccion();
        Panel miPanel2 = new Panel(10,12,miConsumidor,miFiltro);
        miPanel2.add(new Cuadrado(6,6,6));
        miPanel2.add(miPanel);

        //Introspección: Saber de que clase es y como construirlo
        Class Clase;
        try {
            Clase = Class.forName("Panel");
            Object obj = Clase.getDeclaredConstructor(Integer.class,Integer.class,IConsumidor.class,IPredicado.class).newInstance(10,12,miConsumidor,miFiltro);
            ((Panel)obj).add(new Cuadrado(5,3,8)); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}