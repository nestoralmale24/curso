package colections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import colections.datos.Camion;

public class Main {
    public static void main(String[] args) {
        List<String> misCamiones = new ArrayList();
        List<String> misCamionesLiked = new LinkedList<>();

        Camion Camion01 = new Camion("4545-BSD", 89, 9.87);
        Camion Camion02 = new Camion("4545-GHJ", 50, 10);
        Camion Camion03 = new Camion("4545-BSD", 89, 9.87);
        Camion Camion04 = new Camion("8989-XXX", 50, 11);
        Camion Camion05 = new Camion("8989-XYZ", 56, 11);

        misCamiones.add(Camion01.toString());
        misCamiones.add(Camion02.toString());
        misCamiones.add(Camion03.toString());
        misCamiones.add(Camion04.toString());
        misCamiones.add(Camion05.toString());

        misCamionesLiked.add(Camion01.toString());
        misCamionesLiked.add(Camion02.toString());
        misCamionesLiked.add(Camion03.toString());
        misCamionesLiked.add(Camion04.toString());
        misCamionesLiked.add(Camion05.toString());

        for(String lista : misCamiones ){
            System.out.println(lista);
        }

        System.out.println("");
        
        for(String listaLinked : misCamionesLiked ){
            System.out.println(listaLinked);
        }
    }
}