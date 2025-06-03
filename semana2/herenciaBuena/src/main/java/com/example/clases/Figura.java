package com.example.clases;

public abstract class Figura extends Pintado {
    protected int x;
    private int y;
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double dameSuperficie();
    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + "]";
    }

    public abstract double damePerimetro();
}
