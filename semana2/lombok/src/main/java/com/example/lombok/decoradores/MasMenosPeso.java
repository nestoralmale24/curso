package com.example.lombok.decoradores;

import com.example.lombok.model.Clientes;

public class MasMenosPeso extends  Clientes{

    public MasMenosPeso(int edad, String nombre, float peso) {
        super(edad, nombre, peso);
    }

    public float aumentaPeso(float peso) {
       return peso + 10;
    }

    public float disminuyePeso(float peso) {
        return peso -12;
    }
    
}
