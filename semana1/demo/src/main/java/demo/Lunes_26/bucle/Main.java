package demo.Lunes_26.bucle;

public class Main {
    public static void main(String[] args)  {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea(cuadrado.lado));
            
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro(cuadrado.lado));

    }
}