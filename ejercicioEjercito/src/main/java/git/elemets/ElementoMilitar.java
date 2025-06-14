package git.elemets;

public abstract class ElementoMilitar {
    protected String nombre;
    protected double velocidad;
    protected Double blindaje;
    protected Double potenciaFuego;
    protected double precio;

    public ElementoMilitar(String nombre, double velocidad, Double blindaje, Double potenciaFuego, double precio) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.blindaje = blindaje != null ? blindaje : 0.0;
        this.potenciaFuego = potenciaFuego != null ? potenciaFuego : 0.0;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getBlindaje() {
        return blindaje;
    }

    public double getPotenciaFuego() {
        return potenciaFuego;
    }

    public double getPrecio() {
        return precio;
    }
}
