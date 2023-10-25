package com.hauschildt.demo.day16;

import com.hauschildt.demo.day16.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    public void defaultConstructor() {
        String expected = "1/1";
        String actual = new Fraction().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void parameterizedConstructor() {
        Fraction fraction = new Fraction(27, 6);
        String expected = "27/6";
        String actual = fraction.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumerator() {
        int expected = 1;
        int actual = new Fraction().getNumerator();
        assertEquals(expected, actual);
        assertEquals(27, new Fraction(27,6).getNumerator());
    }

    @Test
    public void getDenominator() {
        assertEquals(1, new Fraction().getDenominator());
        assertEquals(6, new Fraction(27,6).getDenominator());
    }

    @Test
    public void setDenominator() {
        int expected = 30;
        Fraction fraction = new Fraction();
        fraction.setDenominator(30);
        int actual = fraction.getDenominator();
        assertEquals(expected, actual);
        assertThrows(Exception.class, () -> fraction.setDenominator(0));
    }

    @Test
    public void setNumerator() {
        int expected = 30;
        Fraction fraction = new Fraction();
        fraction.setNumerator(30);
        int actual = fraction.getNumerator();
        assertEquals(expected, actual);
    }

    @Test
    public void greatestCommonFactor() {
        int actual = Fraction.greatestCommonDivisor(75, 45);
        int expected = 15;
        assertTrue(expected == actual);
        assertEquals(2, Fraction.greatestCommonDivisor(2, 4));
        assertTrue(1 == Fraction.greatestCommonDivisor(5, 7));
    }

    @Test
    public void testDoubles() {
        double expected = 3.3;
        double actual = 1.1 + 2.2;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void mixedNumber() {
        Fraction fraction = new Fraction(4, 1);
        assertEquals("4", fraction.mixedNumber());

        fraction = new Fraction(13, 5);
        assertEquals("2 3/5", fraction.mixedNumber());
    }



}