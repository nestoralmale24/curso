package com.example.lombok.decoradores;

import com.example.lombok.model.Clientes;

public class DisminuyePeso implements ICliente{

    private Clientes cliente;

    @Override
    public float disminuyePeso() {
       return cliente.getPeso() - 12;
    }

    @Override
    public float aumentaPeso() {
        return cliente.getPeso();
    }
    
}
