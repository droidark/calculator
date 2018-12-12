package xyz.krakenkat.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorBasicTest {

    public Calculator calculator = new CalculatorBasic();

    @Test
    public void sum() {
        double addition = calculator.sum(3.2d, 4.7d);
        Assert.assertEquals(7.9d, addition, 0.0001);
    }

    @Test
    public void div() {
        double division = calculator.div(6.4d, 3.2d);
        Assert.assertEquals(2.0d, division, 0.0001);
    }
}