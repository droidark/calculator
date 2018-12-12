package xyz.krakenkat.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorScientific implements Calculator {
    public double sum(double a, double b) {
        log.info("I'm scientific");
        return a + b;
    }

    public double div(double a, double b) {
        log.info("I'm scientific");
        return a / b;
    }
}
