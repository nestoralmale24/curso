package com.example.lombok.decoradores;

import com.example.lombok.model.Clientes;

public class MasMenosPeso extends Clientes{

    public MasMenosPeso(int edad, int peso, String nombre) {
        super(edad, peso, nombre);
    }

    public float aumentaPeso(float peso) {
       return peso + 10;
    }

    public float disminuyePeso(float peso) {
        return peso -12;
    }
    
}
