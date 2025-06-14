package com.example.clases;

public class Octogono extends Figura {
    private int lado;
    public Octogono(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double dameSuperficie() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Octogono [lado=" + lado + "]" + super.toString();
    }

    @Override
    public String damePintura() {
        return "naranja";
    }

    @Override
    public double damePerimetro() {
        return 8 * lado;
    }
}