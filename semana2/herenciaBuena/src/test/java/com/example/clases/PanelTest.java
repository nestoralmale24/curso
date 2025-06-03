package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class PanelTest {
    @Test
    void testAdd() {

    }

    @Test
    void testDamePerimetro() {
        Circulo circuloPrueba = new Circulo(3, 3, 3);
        assertNotNull(circuloPrueba);
        assertEquals("rojo", circuloPrueba.damePintura());
    }

    @Test
    void testDamePintura() {
        Circulo circuloPrueba = new Circulo(3, 3, 3);
        assertNotNull(circuloPrueba);
        assertEquals("rojo", circuloPrueba.damePintura());
    }

    @Test
    void testDameSuperficie() {
    }

    @Test
    void testMuestraColeccion() {

    }
}
