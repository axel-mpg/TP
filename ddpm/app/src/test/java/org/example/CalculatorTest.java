package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;
import java.util.Random;

public class CalculatorTest {
    @Test
    public void testExposant() {
        double aDouble = new Random().nextDouble();
        Assertions.assertEquals(Math.pow(aDouble, 0), new Calculator().exposant(aDouble, 0));
    }
    @Test
    public void testDivision() {
        double aDouble = new Random().nextDouble();
        //Assertions.assertThrows(ArithmeticException.class, ()->new Calculator().division(aDouble,0));
        Assertions.assertEquals(Double.POSITIVE_INFINITY, new Calculator().division(aDouble,0));
    }
    @Test
    public void testDivisionByZero_Double() {
        double aDouble = new Random().nextDouble();
        Assertions.assertDoesNotThrow(()->{double result = aDouble / 0; Assertions.assertTrue(Double.isInfinite(result) || Double.isNaN(result));});
    }
    @Test
    public void testDivisionZero() {
        Assertions.assertEquals(Double.NaN, new Calculator().division(0,0));
    }
}
