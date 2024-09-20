package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz() {
        assertEquals("fizzbuzz", Main.fizzbuzz(35));
        assertEquals("buzz", Main.fizzbuzz(14));
        assertEquals("fizz", Main.fizzbuzz(10));
        assertEquals("41", Main.fizzbuzz(41));
    }

    @Test
    void reverseStr() {
        assertEquals("llatsni ekam", Main.reverseStr("make install"));
    }

    @Test
    void quadraticEquation() throws Exception {
        try {
            Main.quadraticEquation(1, -5, 9);
        } catch (Exception ex) {
            assertEquals("There are no real roots", ex.getMessage());
        }

        try {
            Main.quadraticEquation(0, -3, 4);
        } catch (Exception ex) {
            assertEquals("Its not quadratic equation", ex.getMessage());
        }

        assertEquals(2, Main.quadraticEquation(1, -4, 4)[0]);
        assertArrayEquals(new double[] { 1, -4 }, Main.quadraticEquation(1, 3, -4));
    }

    @Test
    void sumSerias() {
        assertEquals(0.6101121094474383, Main.sumSerias());
    }

    @Test
    void polindrom() {
        assertTrue(Main.polindrom("TeNET"));
        assertFalse(Main.polindrom("bruh"));
    }
}