package com.example.clases;

import java.lang.reflect.InvocationTargetException;

public class FactoriaFiguras 
{
    public static Figura getFactoryShape (String s)
    {
        Figura temp = null;
        if (s.equals ("Circulo"))
            temp = new Circulo (4,5,5);
        else if (s.equals ("Cuadrado"))
            temp = new Cuadrado (8,9,9);
        else if (s.equals ("Triangulo"))
            temp = new TrianguloEquilatero (8,9,9);
        return temp;
    }
    public static Figura getFactoryShapeReflexion (String s)
    {
        Figura temp = null;
        try {
            temp = (Figura) Class.forName(s).getDeclaredConstructor(Integer.class,Integer.class,Integer.class).newInstance(6,5,6);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
