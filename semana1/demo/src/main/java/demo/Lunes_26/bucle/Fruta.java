package demo.Lunes_26.bucle;

public class Fruta{
    private String nombre;
    private int valorCalorico;

    public Fruta(String nombre, int valorCalorico) {
        this.nombre = nombre;
        this.valorCalorico = valorCalorico;
        this.condiciones(nombre, valorCalorico);
    }

    private void condiciones(String nombre, int valorCalorico) {
        if(nombre.length() < 3){
            this.nombre = "nombre no puesto";
        }else{
            this.nombre = nombre;
        }
        
        if(valorCalorico <= 0){
            this.valorCalorico = 1;
        }else{
           this.valorCalorico = valorCalorico;
        }
    }     
    
    @Override
    public String toString() {
        return "Fruta [nombre=" + nombre + ", valorCalorico=" + valorCalorico + "]";
    }
}
