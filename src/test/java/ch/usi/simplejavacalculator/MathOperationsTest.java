package ch.usi.simplejavacalculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static ch.usi.simplejavacalculator.MathOperations.*;
public class MathOperationsTest {


    @Test
    public void testAdd(){
        double expected = 0.0;
        double actual = add(0.0,0.0);
        assertEquals(expected,actual,0.0000001);
    }

    @Test
    public void testAdd1(){
        double expected = 10.00;
        double actual = add(5.0,5.0);
        assertEquals(expected,actual,0.0000001);
    }

    @Test
    public void testOneDevidedBy(){
        double expected = Double.POSITIVE_INFINITY;
        double actual = oneDevidedBy(0.0);
        assertEquals(expected,actual,0.0000001);
    }

    @Test
    public void testOneDevidedBy1(){
        double expected = 1;
        double actual = oneDevidedBy(1.0);
        assertEquals(expected,actual,0.0000001);
    }

    @Test
    public void testOneDevidedBy2(){
        double expected = 0.01;
        double actual = oneDevidedBy(100.0);
        assertEquals(expected,actual,0.0000001);
    }

}
