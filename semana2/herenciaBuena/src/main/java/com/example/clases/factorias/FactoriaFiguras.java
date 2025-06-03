package com.example.clases.factorias;

import java.lang.reflect.InvocationTargetException;

import com.example.clases.Circulo;
import com.example.clases.Cuadrado;
import com.example.clases.Figura;
import com.example.clases.TrianguloEquilatero;

public class FactoriaFiguras 
{
    public static Figura getFactoryShape (String s)
    {
        Figura temp = null;
        switch (s) {
            case "Circulo" -> temp = new Circulo (4,5,5);
            case "Cuadrado" -> temp = new Cuadrado (8,9,9);
            case "Triangulo" -> temp = new TrianguloEquilatero (8,9,9);
            default -> {
            }
        }
        return temp;
    }
    public static Figura getFactoryShapeReflexion (String s)
    {
        Figura temp = null;
        try {
            temp = (Figura) Class.forName(s).getDeclaredConstructor(Integer.class,Integer.class,Integer.class).newInstance(6,5,6);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
        }
        return temp;
    }
}
