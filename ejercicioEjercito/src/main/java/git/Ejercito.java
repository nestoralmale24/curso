package git;

import java.util.ArrayList;
import java.util.List;

import git.elemets.ElementoMilitar;

public class Ejercito {
    private List<ElementoMilitar> elementos;
    private double fondoDisponible;

    public Ejercito(double fondoDisponible) {
        this.elementos = new ArrayList<>();
        this.fondoDisponible = fondoDisponible;
    }

    public boolean agregarElemento(ElementoMilitar e) {
        if (getCostoTotal() + e.getPrecio() <= fondoDisponible) {
            elementos.add(e);
            return true;
        } else {
            System.out.println("No hay fondos suficientes para añadir este elemento.");
            return false;
        }
    }

    public double getCostoTotal() {
        return elementos.stream().mapToDouble(ElementoMilitar::getPrecio).sum();
    }

    public double calcularCM() {
        double pfTotal = elementos.stream().mapToDouble(ElementoMilitar::getPotenciaFuego).sum();
        double cmTotal = elementos.stream().mapToDouble(ElementoMilitar::getVelocidad).sum();
        double blTotal = elementos.stream().mapToDouble(ElementoMilitar::getBlindaje).sum();

        if (100 - blTotal <= 0) {
            System.out.println("Blindaje demasiado alto. CM indefinido.");
            return 0;
        }

        return (pfTotal * Math.pow(cmTotal, 2)) / (100 - blTotal);
    }

    public void mostrarElementos() {
        for (ElementoMilitar e : elementos) {
            System.out.printf("Nombre: %-30s | Tipo: %-10s | Vel: %.1f | Bl: %.1f | PF: %.1f | Precio: %.2f €\n",
                    e.getNombre(), e.getClass().getSimpleName(), e.getVelocidad(), e.getBlindaje(),
                    e.getPotenciaFuego(), e.getPrecio());
        }
    }
}
