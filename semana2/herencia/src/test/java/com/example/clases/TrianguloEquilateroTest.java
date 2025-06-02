package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TrianguloEquilateroTest {
    @Test
    void testDamePerimetro() {
        TrianguloEquilatero trianguloPrueba = new TrianguloEquilatero(3, 3, 3);
        assertNotNull(trianguloPrueba);
        assertEquals(9, trianguloPrueba.damePerimetro());
    }

    @Test
    void testDamePintura() {
        TrianguloEquilatero trianguloPrueba = new TrianguloEquilatero(3, 3, 3);
        assertNotNull(trianguloPrueba);
        assertEquals("verde", trianguloPrueba.damePintura());
    }

    @Test
    void testDameSuperficie() {
        TrianguloEquilatero trianguloPrueba = new TrianguloEquilatero(3, 3, 3);
        assertNotNull(trianguloPrueba);
        assertEquals(3.89, trianguloPrueba.dameSuperficie(), 0.010);
    }
}
