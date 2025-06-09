package com.example.clases;

public abstract class Figura extends Pintado {
    static int numeroDeFiguras = 0;

    protected int x;
    private int y;
    public Figura(int x, int y) {
        numeroDeFiguras++;
        this.x = x;
        this.y = y;
    }
    public abstract double dameSuperficie();
    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + "]";
    }

    public abstract double damePerimetro();
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Figura other = (Figura) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}
