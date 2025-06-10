package com.example;

import com.example.services.AlmacenarEnDisco;

public class Main {
    public static void main(String[] args) {
        var almacenador = new AlmacenarEnDisco();        
        Tanque mitTanque = new Tanque(89, almacenador);
        almacenador.guardarTanque(mitTanque);
        Tanque tanqueLeido = almacenador.leerTanque();
        System.out.println(tanqueLeido);
    }
}