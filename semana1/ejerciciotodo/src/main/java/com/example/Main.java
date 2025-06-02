package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Que numero de encargado eres:");
        int number = scan.nextInt();

        IEncargado MiConsumidor1 = new Contable();
        IEncargado MiConsumidor2 = new Almacenero();
        IEncargado MiConsumidor3 = new Artista();

        IFiltro filtroContable = new FiltroPorPrecio();
        IFiltro filtroDeAlmacenero = new FiltroPorVolumen();
        IFiltro filtroArtista = new FiltroPorValorArtistico();

        Objetos[] objetos = new Objetos[]{
            new Ceramica("Ceramica", 200, 2.2, 1000),
            new Abanico("Abanico", 0, 0.5, 600),
            new Abanico("Abanico",0, 0.5, 600),
            new Sancai("Sacai", 100, 2.3, 200),
            new Cometa("Cometa", 50, 0.4, 500),
            new Cometa("Cometa",50, 0.4, 500),
            new Cometa("Cometa",50, 0.4, 500)
        };

        
        if(number == 1){
            System.out.println("Te saco tipo artesania y precio");
            Almacen almacen1 = new Almacen("", 0, 0, 0, MiConsumidor1, filtroContable);
            almacen1.add(objetos);
            almacen1.muestraColeccion();
        } 
        else if(number == 2){
            System.out.println("Te saco tipo volumen mayor a 0.5");
            Almacen almacen2 = new Almacen("", 0, 0, 0, MiConsumidor2, filtroDeAlmacenero);
            almacen2.add(objetos);
            almacen2.muestraColeccion();
        }else{
            System.out.println("Te saco tipo valor mayor a 200");
            Almacen almacen3 = new Almacen("", 0, 0, 0, MiConsumidor3, filtroArtista);
            almacen3.add(objetos);
            almacen3.muestraColeccion();
        }
    }

}