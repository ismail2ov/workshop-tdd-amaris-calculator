package es.develex.calculator;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void whenRunCalculateThenHisValueIsZero() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getValue());
    }
}
