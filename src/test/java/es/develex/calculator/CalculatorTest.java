package es.develex.calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void whenRunCalculateThenHisValueIsZero() {
        assertEquals(BigDecimal.ZERO, calculator.getValue());
    }

    @Test
    public void whenSetTheValueThenCalculatorAccumulationIsValue() {
        BigDecimal value = new BigDecimal(55);

        calculator.setValue(value);

        assertEquals(value, calculator.getValue());
    }

    @Test
    public void whenClearCalculatorThenHisValueIsZero() {
        BigDecimal value = new BigDecimal(55);
        calculator.setValue(value);
        assertEquals(value, calculator.getValue());
        calculator.clear();

        assertEquals(BigDecimal.ZERO, calculator.getValue());
    }
}
