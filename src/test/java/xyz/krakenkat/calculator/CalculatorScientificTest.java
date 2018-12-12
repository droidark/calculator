package xyz.krakenkat.calculator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
@Slf4j
public class CalculatorScientificTest {

    public Calculator calculator = new CalculatorScientific();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Parameterized.Parameter(value = 0)
    public double a;

    @Parameterized.Parameter(value = 1)
    public double b;

    @Parameterized.Parameter(value = 2)
    public double expected;

    @Parameterized.Parameter(value = 3)
    public Class<Throwable> exceptionClass;

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2.0d, 2.0d, 4.0d, null},
                {2.0d, -2.0d, 0.0d, null}
        });
    }

    @Test
    public void sum() throws Exception {
        if(exceptionClass != null) {
            thrown.expect(exceptionClass);
        }
        double res = calculator.sum(a, b);
        Assert.assertEquals(expected, res, 0.0001d);
    }
}