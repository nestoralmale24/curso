package com.example.clases;

import java.util.ArrayList;

public class Panel extends Figura{
    private IConsumidor Consumidor;
    private IPredicado Filtro;
    private int _anchura;
    private int _altura;
    private ArrayList<Figura> misFiguras = new ArrayList<>();

    public void add(Figura FiguraAPoner)
    {
        this.misFiguras.add(FiguraAPoner);
    }
    public Panel(int anchura, int altura, IConsumidor Consumidor, IPredicado Filtro) {
        super(5,5);
        this._anchura = anchura;
        this._altura = altura;
        this.Consumidor = Consumidor;
        this.Filtro = Filtro;
    }
    public void muestraColeccion()
    {
        var misFiguras2 = misFiguras.stream().filter(this.Filtro::filtrar);
        misFiguras2.forEach(this.Consumidor::consume);
    }
    @Override
    public double dameSuperficie() {
        double superficie = 0;
        //misFiguras.stream().mapToDouble(x->x.dameSuperficie()).sum();

        for (var FiguraRecorrida : misFiguras) {
            superficie=superficie+FiguraRecorrida.dameSuperficie();
        }    
        return superficie;
    }
    @Override
    public double damePerimetro() {
        double perimetro = 0;
        //misFiguras.stream().mapToDouble(x->x.dameSuperficie()).sum();

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
