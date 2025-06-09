package com.example.clases;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.example.clases.comparators.IFiguraComparador;
import com.example.clases.consumers.IConsumidor;
import com.example.clases.specifications.IPredicado;

public class Panel extends Figura{
    private IConsumidor consumidor;
    private IPredicado filtro;
    private IFiguraComparador comparador;
    private Set<Figura> misFiguras = new HashSet<>();

    public void add(Figura figuraAPoner)
    {
        this.misFiguras.add(figuraAPoner);
    }
    public Panel(int anchura, int altura, IConsumidor consumidor, IPredicado filtro, IFiguraComparador figuraComparador) {
        super(5,5);
        this.consumidor = consumidor;
        this.filtro = filtro;
        this.comparador = figuraComparador;
    }
    public void muestraColeccion()
    {
        var coleccion = misFiguras.stream().sorted(this.comparador::ordena);
        var misFiguras2 = coleccion.toList().stream().filter(this.filtro::filtrar);
        misFiguras2.forEach(this.consumidor::consume);
    }
    @Override
    public double dameSuperficie() {
        return misFiguras.parallelStream().mapToDouble(x->x.dameSuperficie()).sum();
    }
    @Override
    public double damePerimetro() {
        double perimetro = 0;
        for (var FiguraRecorrida : misFiguras) {
            perimetro+=FiguraRecorrida.damePerimetro();
        }    
        return perimetro;
    }
    @Override
    public String damePintura() {
        return "azul"+Figura.numeroDeFiguras;
    }
}
