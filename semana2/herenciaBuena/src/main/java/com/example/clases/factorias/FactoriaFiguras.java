// Clase de factoría para crear instancias de figuras geométricas
// usando métodos directos o reflexión.
package com.example.clases.factorias;

import java.lang.reflect.InvocationTargetException;

import com.example.clases.Circulo;
import com.example.clases.Cuadrado;
import com.example.clases.Figura;
import com.example.clases.Octogono;
import com.example.clases.TrianguloEquilatero;

/**
 * Factoría de figuras geométricas.
 * Permite crear instancias de diferentes figuras usando un nombre de tipo.
 */
public class FactoriaFiguras 
{
    /**
     * Crea una figura según el nombre proporcionado.
     * @param s Nombre de la figura ("Circulo", "Cuadrado", "Triangulo", "Octogono")
     * @return Instancia de la figura correspondiente o null si no existe.
     */
    public static Figura getFactoryShape (String s)
    {
        Figura temp = null;
        switch (s) {
            case "Circulo" -> temp = new Circulo (4,5,5); // Crea un círculo de radio 4 en (5,5)
            case "Cuadrado" -> temp = new Cuadrado (8,9,9); // Crea un cuadrado de lado 8 en (9,9)
            case "Triangulo" -> temp = new TrianguloEquilatero (8,9,9); // Triángulo equilátero de lado 8 en (9,9)
            case "Octogono" -> temp = new Octogono(7, 8, 8); // Octógono de lado 7 en (8,8)
            default -> {
            }
        }
        return temp;
    }

    /**
     * Crea una figura usando reflexión, a partir del nombre de la clase completa.
     * @param s Nombre completo de la clase (por ejemplo, "com.example.clases.Cuadrado")
     * @return Instancia de la figura o null si ocurre un error.
     */
    public static Figura getFactoryShapeReflexion (String s)
    {
        Figura temp = null;
        try {
            // Intenta crear una instancia usando el constructor (Integer, Integer, Integer)
            temp = (Figura) Class.forName(s).getDeclaredConstructor(Integer.class,Integer.class,Integer.class).newInstance(6,5,6);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            // Si ocurre cualquier excepción, retorna null
        }
        return temp;
    }
}
