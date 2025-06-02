package demo.Lunes_26.bucle;

public class Cuadrado {
    int lado;

    
    public Cuadrado (int lado) {
        this.lado = lado;
    }
    
    public int calcularArea(int lado){
        int area = lado * lado;
        return area;
    }

    public int calcularPerimetro(int lado){
        int perimetro = lado * 4;
        return perimetro;
    }

}
