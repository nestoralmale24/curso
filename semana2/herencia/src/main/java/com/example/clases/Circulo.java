package com.example.clases;

public class Circulo extends Figura{
    private int radio;
    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double dameSuperficie() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]" + super.toString();
    }

    @Override
    public String damePintura() {
        return "rojo";
    }

    @Override
    public double damePerimetro() {
        return 2*Math.PI*radio;
    }

    
}
