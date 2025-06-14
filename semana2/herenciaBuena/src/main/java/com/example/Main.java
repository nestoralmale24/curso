package com.example;

import com.example.clases.Cuadrado;
import com.example.clases.Panel;
import com.example.clases.TipoFigura;
import com.example.clases.consumers.ConsumidorJacinto;
import com.example.clases.consumers.IConsumidor;
import com.example.clases.factorias.FactoriaFiguras;
import com.example.clases.factorias.FactoriaJacinto;
import com.example.clases.specifications.AndSpecification;
import com.example.clases.specifications.CompositeSpecification;
import com.example.clases.specifications.FiltrarPorPerimetro;
import com.example.clases.specifications.FiltrarPorSuperficie;
import com.example.clases.specifications.IPredicado;
import com.example.clases.specifications.OrSpecification;

/*
 * Programa principal de ejemplo de uso de colecciones y patrones de diseño en Java.
 *
 * Este programa crea un panel de figuras geométricas (como cuadrados, círculos y octógonos),
 * aplicando diferentes filtros (por superficie y perímetro) y utilizando consumidores para mostrar resultados.
 * Se emplean patrones como Composite, Factory y Specification para la gestión y filtrado de las figuras.
 *
 * Flujo principal:
 * - Se crean filtros compuestos y simples para filtrar figuras según criterios geométricos.
 * - Se instancia una factoría personalizada para crear figuras según el tipo solicitado.
 * - Se agregan varias figuras al panel, tanto mediante factoría por reflexión como por factoría personalizada.
 * - Se muestra la colección de figuras filtradas y procesadas por el consumidor.
 * - Se crea un segundo panel para mostrar la reutilización y composición de paneles y figuras.
 *
 * Este ejemplo es útil para entender cómo organizar código orientado a objetos, aplicar patrones de diseño
 * y trabajar con colecciones y filtros en Java.
 */

// Programa principal: crea un panel con diferentes figuras geométricas (cuadrado, círculo, octógono),
// aplica filtros y muestra la colección de figuras. Ejemplo de uso de patrones de diseño y colecciones.
public class Main {
    public static void main(String[] args) {

        var filtroMultiple = new CompositeSpecification();
        IConsumidor miConsumidor = new ConsumidorJacinto();
        IPredicado miFiltro = new FiltrarPorSuperficie();
        IPredicado miFiltro2 = new FiltrarPorPerimetro();
        var factoria = new FactoriaJacinto(miFiltro);
        OrSpecification miFiltro3 = new OrSpecification(miFiltro, miFiltro2);
        AndSpecification miFiltro4 = new AndSpecification(miFiltro2, miFiltro3);
        filtroMultiple.add(miFiltro);
        filtroMultiple.add(miFiltro2);
        filtroMultiple.add(miFiltro3);
        filtroMultiple.add(miFiltro4);
        Panel miPanel = new Panel(9,10,miConsumidor,filtroMultiple);

        miPanel.add(FactoriaFiguras.getFactoryShapeReflexion("Cuadrado"));
        var miFigura = factoria.getInstance(TipoFigura.Circulo, 6, 5, 5); 
        if (miFigura != null)
            miPanel.add(miFigura);
        factoria.setMiFiltro(miFiltro4);

        miPanel.add(factoria.getInstance(TipoFigura.Cuadrado, 5,4,5));
        miPanel.add(FactoriaFiguras.getFactoryShapeReflexion("Octogono"));
        var miOctogono = factoria.getInstance(TipoFigura.Octogono, 7, 8, 8);
        if (miOctogono != null)
            miPanel.add(miOctogono);
      
        miPanel.muestraColeccion();
        Panel miPanel2 = new Panel(10,12,miConsumidor,miFiltro);
        miPanel2.add(new Cuadrado(6,6,6));
        miPanel2.add(miPanel);
    }
}
// Fin del programa principal: se han añadido y mostrado varias figuras en el panel, incluyendo Octogono.