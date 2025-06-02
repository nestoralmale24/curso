package com.example.clases;

public class TrianguloEquilatero extends Figura {

    private int lado;
    public TrianguloEquilatero(int lado,int x, int y) {
        super(x, y);
        this.lado = lado;
    }
    @Override
    public double dameSuperficie() {
        return (Math.sqrt(3)/4)*Math.pow(this.lado,2); 
    }
    @Override
    public String damePintura() {
        return "verde";
    }
    @Override
    public double damePerimetro() {
      return this.lado*(double) 3;
    }

}
