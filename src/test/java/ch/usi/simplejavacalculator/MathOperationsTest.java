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

}