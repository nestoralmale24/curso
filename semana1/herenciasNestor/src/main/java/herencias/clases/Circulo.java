package herencias.clases;

public class Circulo extends Figura{

    private int radio;

    public Circulo(int x, int y, String color, int radio) {
        super(x, y, color);
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]"+ super.toString();
    }

    public double calcularDiametro() {
       return radio * 2;

    }
    @Override
    public double calcularPerimetro() {
        double diametro = calcularDiametro();
        return Math.PI*diametro;
    }
    
}
