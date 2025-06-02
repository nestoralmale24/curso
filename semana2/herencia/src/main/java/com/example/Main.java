package semana2.herencia.src.main.java.com.example;

import com.example.clases.AndSpecification;
import com.example.clases.IConsumidor;
import com.example.clases.IPredicado;
import com.example.clases.Panel;
import com.example.clases.specifications.CompositeSpecification;

public class Main {
    public static void main(String[] args) {

        var filtroMultiple = new CompositeSpecification();
        IConsumidor miConsumidor = new ConsumidorJacinto();
        IPredicado miFiltro = new FiltrarPorSuperficie();
        IPredicado miFiltro2 = new FiltrarPorPerimetro();
        var factoria = new FactoriaJacinto(miFiltro);
        OrSpecification miFiltro3 = new OrSpecification(miFiltro, miFiltro2);
        AndSpecification miFiltro4 = new AndSpecification(miFiltro2, miFiltro3);
        filtroMultiple.add(miFiltro);
        filtroMultiple.add(miFiltro2);
        filtroMultiple.add(miFiltro3);
        filtroMultiple.add(miFiltro4);
        Panel miPanel = new Panel(9,10,miConsumidor,filtroMultiple);

        miPanel.add(FactoriaFiguras.getFactoryShapeReflexion("Cuadrado"));
        var miFigura = factoria.getInstance(TipoFigura.Circulo, 6, 5, 5); 
        if (miFigura != null)
            miPanel.add(miFigura);
        factoria.setMiFiltro(miFiltro4);

        miPanel.add(factoria.getInstance(TipoFigura.Cuadrado, 5,4,5));
      
        miPanel.muestraColeccion();
        Panel miPanel2 = new Panel(10,12,miConsumidor,miFiltro);
        miPanel2.add(new Cuadrado(6,6,6));
        miPanel2.add(miPanel);
    }
}