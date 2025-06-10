package com.example;

import java.io.Serializable;
import java.util.ArrayList;

import com.example.services.IAlmacenamientoTanque;

public class Tanque implements IUnidaMilitar,Serializable{
    private IAlmacenamientoTanque almacenador;
    private static final long serialVersionUID = 128382378237283L;
    private double velocidad;
    ArrayList<Bala> municion = new ArrayList<>();

    
    public Tanque(double velocidad, IAlmacenamientoTanque almacenamiento) {
        this.velocidad = velocidad;
    }


    @Override
    public double dameVelocidad() {
        return this.velocidad;
    }

    public void guarda(){
        almacenador.guardarTanque(this);
    }


    @Override
    public String toString() {
        return "Tanque [velocidad=" + velocidad + ", municion=" + municion + "]";
    }
}
