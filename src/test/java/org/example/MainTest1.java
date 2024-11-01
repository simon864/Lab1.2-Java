package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFizzBuzz() {
        assertEquals("fizz", Main.fizzBuzz(15));
        assertEquals("buzz", Main.fizzBuzz(14));
        assertEquals("fizzbuzz", Main.fizzBuzz(35));
        assertEquals("1", Main.fizzBuzz(1));
    }

    @Test
    void testReverseString() {
        assertEquals("llatsni ekam", Main.reverseString("make install"));
    }

    @Test
    void testQuadraticEquation() {
        assertEquals("2.0, -2.0", Main.quadraticEquation(1, -4, 4));
        assertEquals("there are no real roots", Main.quadraticEquation(1, 2, 2));
    }

    @Test
    void testSumOfSeries() {
        assertEquals(0.6101111104444433, Main.sumOfSeries(10), 0.00001);
    }

    @Test
    void testPalindrome() {
        assertTrue(Main.isPalindrome("racecar"));
        assertFalse(Main.isPalindrome("hello"));
    }
}