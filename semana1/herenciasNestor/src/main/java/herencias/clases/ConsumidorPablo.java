package herencias.clases;

public class ConsumidorPablo implements IConsumidor{

    @Override
    public void muestra(Figura MiFigura) {
        System.out.println("La superficie es:" + MiFigura.calcularSuperficie());
    }
    
}
