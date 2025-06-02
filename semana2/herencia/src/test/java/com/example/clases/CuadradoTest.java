package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    void testDamePerimetro() {
        Cuadrado cuadradoPrueba = new Cuadrado(3, 3, 3);
        assertNotNull(cuadradoPrueba);
        assertEquals(12, cuadradoPrueba.damePerimetro());
    }

    @Test
    void testDamePintura() {
        Cuadrado cuadradoPrueba = new Cuadrado(3, 3, 3);
        assertNotNull(cuadradoPrueba);
        assertEquals("azul", cuadradoPrueba.damePintura());
    }

    @Test
    void testDameSuperficie() {
        Cuadrado cuadradoPrueba = new Cuadrado(3, 3, 3);
        assertNotNull(cuadradoPrueba);
        assertEquals(9, cuadradoPrueba.dameSuperficie());
    }
}
