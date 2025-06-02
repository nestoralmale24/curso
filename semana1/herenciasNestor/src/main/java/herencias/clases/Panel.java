package herencias.clases;

import java.util.ArrayList;

public class Panel {
    private IConsumidor consumidor;
    private IPredicado filtro;
    private int anchura;
    private int altura;
    private ArrayList<Figura> misFiguras = new ArrayList<>();
    
    public Panel(int altura, int anchura, IConsumidor consumidor, IPredicado filtro) {
        this.altura = altura;
        this.anchura = anchura;
        this.consumidor = consumidor;
        this.filtro = filtro;
    }

    public void add(Figura figura) {
        misFiguras.add(figura);
    }

    public void muestra(){
        var m2 = misFiguras.stream().filter(this.filtro::filtrar);
        m2.forEach(this.consumidor::muestra);
    }
}
