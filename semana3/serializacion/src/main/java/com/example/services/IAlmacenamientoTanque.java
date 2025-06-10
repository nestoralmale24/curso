package com.example.services;

import com.example.Tanque;

public interface IAlmacenamientoTanque {
    void guardarTanque(Tanque miTanque);
    Tanque leerTanque();
}
