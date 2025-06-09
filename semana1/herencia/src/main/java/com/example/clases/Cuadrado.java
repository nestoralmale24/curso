package com.example.clases;

public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(int lado,int x, int y) {
        super(x, y);
        this.lado = lado;
    }
    @Override
    public double dameSuperficie() {
        return lado * (double)lado;
    }
    @Override
    public String toString() {
        super.x = 89;
        return "Cuadrado [lado=" + lado + "]"+super.toString();
    }
    @Override
    public String damePintura() {
        return "azul";
    }
    @Override
    public double damePerimetro() {
        return this.lado*4;
    }
}
