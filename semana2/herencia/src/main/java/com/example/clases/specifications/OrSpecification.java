package com.example.clases.specifications;

import com.example.clases.Figura;

public class OrSpecification implements IPredicado{
    IPredicado MiPredicado1;
    IPredicado MiPredicado2;

    
    public OrSpecification(IPredicado miPredicado1, IPredicado miPredicado2) {
        MiPredicado1 = miPredicado1;
        MiPredicado2 = miPredicado2;
    }


    @Override
    public boolean filtrar(Figura MiFigura) {
        return MiPredicado1.filtrar(MiFigura) || MiPredicado2.filtrar(MiFigura); 
    }

}
