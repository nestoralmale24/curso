package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CirculoTest {


    @Test
    void testDamePerimetro() {
        Circulo circuloPrueba = new Circulo(3, 3, 3);
        assertNotNull(circuloPrueba);
        assertEquals(18.84, circuloPrueba.damePerimetro(), 0.010);
    }

    @Test
    void testDamePintura() {
        Circulo circuloPrueba = new Circulo(3, 3, 3);
        assertNotNull(circuloPrueba);
        assertEquals("rojo", circuloPrueba.damePintura());
    }

    @Test
    void testDameSuperficie() {
        Circulo circuloPrueba = new Circulo(3, 3, 3);
        assertNotNull(circuloPrueba);
        assertEquals(28.27, circuloPrueba.dameSuperficie(), 0.04);
    }
}
