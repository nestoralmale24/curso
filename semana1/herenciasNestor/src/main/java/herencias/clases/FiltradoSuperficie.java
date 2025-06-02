package herencias.clases;

public class FiltradoSuperficie implements IPredicado {

    @Override
    public boolean filtrar(Figura Mifigura) {
        return(Mifigura.calcularSuperficie()>30);
    }
}
