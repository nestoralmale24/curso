package com.example.lombok.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda{
    private List<Clientes> clientes = new ArrayList<>();

    public void agregarCliente(Clientes cliente) {
        clientes.add(cliente);
    }

    public List<Float> obtenerPesosClientes() {
        return clientes.stream()
                    .map(Clientes::getPeso)
                    .collect(Collectors.toList());
    }

}
