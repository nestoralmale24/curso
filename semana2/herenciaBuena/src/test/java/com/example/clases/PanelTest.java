package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class PanelTest {

    @Test
    void testDamePerimetroWithNoFiguras() {
        Panel panel = new Panel(10, 10, null, f -> true);
        assertEquals(0.0, panel.damePerimetro());
    }

    @Test
    void testDamePerimetroWithOneFigura() {
        Panel panel = new Panel(10, 10, null, f -> true);
        Figura circulo = new Circulo(0, 0, 2); // perimetro = 2 * PI * 2 = 12.566...
        panel.add(circulo);
        assertEquals(circulo.damePerimetro(), panel.damePerimetro(), 0.0001);
    }

    @Test
    void testDamePerimetroWithMultipleFiguras() {
        Panel panel = new Panel(10, 10, null, f -> true);
        Figura circulo = new Circulo(0, 0, 2); // perimetro = 12.566...
        Figura circulo2 = new Circulo(0, 0, 3); // perimetro = 18.849...
        panel.add(circulo);
        panel.add(circulo2);
        double expected = circulo.damePerimetro() + circulo2.damePerimetro();
        assertEquals(expected, panel.damePerimetro(), 0.0001);
    }
}
