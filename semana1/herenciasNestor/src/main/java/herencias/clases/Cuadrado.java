package herencias.clases;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int x, int y, String color, int lado) {
        super(x, y, color);
        this.lado = lado;
        
    }

    @Override
    public double calcularSuperficie() {
        return lado * (double)lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]"+ super.toString();
    }

}
