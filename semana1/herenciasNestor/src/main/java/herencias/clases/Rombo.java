package herencias.clases;

public class Rombo extends Figura {

    private int ladoCorto;
    private int ladoLargo;

    public Rombo(int x, int y, String color, int ladoCorto, int ladoLargo) {
        super(x, y, color);
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo ;
    }

    @Override
    public double calcularSuperficie() {
       return ladoCorto * ladoLargo;
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
