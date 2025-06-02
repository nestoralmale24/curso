package herencias;

import herencias.clases.Circulo;
import herencias.clases.Cuadrado;
import herencias.clases.Figura;
import herencias.clases.IColor;
import herencias.clases.Rombo;
import herencias.clases.Triangulo;

public class Main {
    private IColor color;

    public static void main(String[] args) {
        
        Figura miCuadrado = new Cuadrado(5, 3, "amarillo", 2);

        Figura miCirculo = new Circulo(6, 5, "azul", 5);

        Figura miTriangulo = new Triangulo(2, 16, "verde", 3);
        
        Figura miRombo = new Rombo(1, 7, "rojo", 2, 2);

        Figura[] figuras = {miCuadrado, miCirculo, miTriangulo, miRombo};



        System.out.println("");
        //superficices
        double cuadrado = figuras[0].calcularSuperficie();
        double circulo = figuras[1].calcularSuperficie();
        double triangulo = figuras[2].calcularSuperficie();
        double rombo = figuras[3].calcularSuperficie();
        //perimetros
        double cuadradoP = figuras[0].calcularPerimetro();
        double circuloP = figuras[1].calcularPerimetro();
        double trianguloP = figuras[2].calcularPerimetro();
        //colores
        String cuadradoC = figuras[0].setColor("lila");
        String circuloC = figuras[1].setColor("verde");
        String trianguloC = figuras[2].setColor("azul");
        String romboC = figuras[3].setColor("rojo");


        System.out.println("CUADRADO: (" + miCuadrado.getClass() + " - " + cuadradoC + ") " + cuadrado);
        System.out.println("");
        System.out.println("CIRCULO: (" + miCirculo.getClass() + " - " + circuloC + ") " + circulo);
        System.out.println("");
        System.out.println("TRIANGULO: (" + miTriangulo.getClass() + " - " + trianguloC + ") " + triangulo);
        System.out.println("");
        System.out.println("ROMBO: (" + miRombo.getClass() + " - " + romboC + ") " + rombo);
        System.out.println("");
    }
}