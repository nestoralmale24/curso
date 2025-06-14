package git;

import git.elemets.Artilleria;
import git.elemets.Caballeria;
import git.elemets.Infanteria;

public class Main {
 public static void main(String[] args) {
        Ejercito ejercito = new Ejercito(30000);

        ejercito.agregarElemento(new Caballeria("Transporte MX-7899", 4.5, 1.4, null, 4200));
        ejercito.agregarElemento(new Caballeria("Tanque Sombras-VB98", 7.3, 4.8, 9.8, 15600));
        ejercito.agregarElemento(new Caballeria("Transporte rápido TAXIN-66", 12.0, null, null, 1600));

        ejercito.agregarElemento(new Infanteria("Infantería Básica", 6.0, null, 7.0, 250));
        ejercito.agregarElemento(new Infanteria("Ametrallador", 4.0, null, 10.0, 400));
        ejercito.agregarElemento(new Infanteria("Sanitario", 7.0, 5.0, null, 500));

        ejercito.agregarElemento(new Artilleria("Cañón Antiaéreo", 1.0, null, 22.0, 1100));
        ejercito.agregarElemento(new Artilleria("Torpedero móvil", 3.0, 2.0, 19.0, 1350));
        ejercito.agregarElemento(new Artilleria("Cañón", 0.0, null, 14.0, 1100));

        System.out.println("Elementos en el ejercito:");
        ejercito.mostrarElementos();

        System.out.println("\nCosto total del ejercito: " + ejercito.getCostoTotal() + " €");
        System.out.println("Capacidad Militar (CM): " + ejercito.calcularCM());
    }
}