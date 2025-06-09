package com.example.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circuloPrueba = null;

    @BeforeEach
    void inicializa()
    {
        circuloPrueba = new Circulo(3,3,3);
    }
    @Test
    @DisplayName("😱")
    void testDamePerimetro() {
        assertNotNull(circuloPrueba);
        assertEquals(18.84,circuloPrueba.damePerimetro(),0.010);
        assertFalse(16==circuloPrueba.damePerimetro());
    }

    @Test
    void testDamePintura() {
        assertNotNull(circuloPrueba);
        assertEquals("rojo",circuloPrueba.damePintura());
    }

    @Test
    void testDameSuperficie() {
        assertNotNull(circuloPrueba);
        assertEquals(28.27,circuloPrueba.dameSuperficie(),0.04);
    }
}
