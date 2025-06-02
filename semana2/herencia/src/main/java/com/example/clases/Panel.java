package com.example.clases;

import java.util.ArrayList;

import com.example.clases.consumers.IConsumidor;
import com.example.clases.specifications.IPredicado;

public class Panel extends Figura{
    private IConsumidor consumidor;
    private IPredicado filtro;
    private ArrayList<Figura> misFiguras = new ArrayList<>();

    public void add(Figura figuraAPoner)
    {
        this.misFiguras.add(figuraAPoner);
    }
    public Panel(int anchura, int altura, IConsumidor consumidor, IPredicado filtro) {
        super(5,5);
        this.consumidor = consumidor;
        this.filtro = filtro;
    }
    public void muestraColeccion()
    {
        var misFiguras2 = misFiguras.stream().filter(this.filtro::filtrar);
        misFiguras2.forEach(this.consumidor::consume);
    }
    @Override
    public double dameSuperficie() {
        double superficie = 0;
        for (var FiguraRecorrida : misFiguras) {
            superficie=superficie+FiguraRecorrida.dameSuperficie();
        }    
        return superficie;
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
        return "azul";
    }
}
