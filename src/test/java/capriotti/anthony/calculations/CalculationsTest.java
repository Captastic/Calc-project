package capriotti.anthony.calculations;

/**
 * Created by anthonycapriotti on 1/16/17.
 */

import static org.junit.Assert.*;
import capriotti.anthony.calculations.Calculations;
import org.junit.Before;
import org.junit.Test;

public class CalculationsTest {
    Calculations calculations = new Calculations();

    @Test
    public void additionTest(){
        double expected = 9.0d;
        double actual = calculations.addition(4.0d, 5.0d);
        assertEquals(expected, actual, 0);

    }

    @Test
    public void subtractionTest(){
        double expected = 10.0d;
        double actual = calculations.subtraction(20.0d, 10.0d);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplicationTest(){
        double expected = 50.0d;
        double actual = calculations.multiplication(25.0d, 2.0d);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void divisionTest(){
        double expected = 5.0d;
        double actual = calculations.division(10.0d, 0.0d);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void exponentsTest(){
        double expected = 9.0;
        double actual = calculations.power(3.0d, 2.0d);
        assertEquals(expected, actual, 0);

    }
    @Test
    public void squaredTest(){
        double expected = 25.0d;
        double actual = calculations.squared(5.0);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void squareRootTest(){
        double expected = 5.0d;
        double actual = calculations.squareRoot(25.0d);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void absoluteValue(){
        double expected = 5.0d;
        double actual = calculations.absoluteValue(-5.0d);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseTest(){
        double expected = 0.1d;
        double actual = calculations.inverse(10.0d);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void sineTest(){
        double expected = 0.8414709848078965d;
        double actual = calculations.sine(1.0d);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void cosineTest(){
        double expected = 0.5403023058681398d;
        double actual = calculations.cosine(1.0d);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void tangentTest(){
        double expected = 1.5574077246549023;
        double actual = calculations.tangent( 1.0);
        assertEquals(expected, actual, 0);
    }


}
