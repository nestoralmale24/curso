package demo.Lunes_26.bucle;

public class Alumno {
    private String nombre;
    private int edad;
    private String apellido;

    public Alumno(String apellido, int edad, String nombre) {
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + "]";
    }

    public void condiciones(String nombre) {
        if(nombre.isEmpty()){
            this.nombre = "No ingreso nombre";
        }else{
            this.nombre = nombre;
        }
    } 
}
