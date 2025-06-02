package herencias.clases;

public class ConsumidorNestor implements IConsumidor{

    @Override
    public void muestra(Figura MiFigura) {
        System.out.println(MiFigura.getClass() + ": " + MiFigura.calcularSuperficie());
    }
    
}
