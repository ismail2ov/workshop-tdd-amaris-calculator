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

    @Test
    public void whenSetTheValueThenCalculatorAccumulationIsValue() {
        Calculator calculator = new Calculator();
        BigDecimal value = new BigDecimal(55);

        calculator.setValue(value);

        assertEquals(value, calculator.getValue());
    }
}
