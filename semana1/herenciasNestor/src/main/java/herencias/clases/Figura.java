package herencias.clases;

public abstract class Figura extends  Color{
    private int x;
    private int y;

    public Figura(int x, int y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public abstract double calcularSuperficie();

    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + "]";
    }
}
