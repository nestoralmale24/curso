package herencias.clases;

public class Triangulo extends Figura{
    private int lado;


    public Triangulo(int x, int y, String color, int lado) {
        super(x, y, color);
        this.lado = lado;
    }

    
    @Override
    public double calcularSuperficie() {
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3;	
    }

    @Override
    public String toString() {
        return "Triangulo [lado=" + lado + "]"+ super.toString();
    }
}
