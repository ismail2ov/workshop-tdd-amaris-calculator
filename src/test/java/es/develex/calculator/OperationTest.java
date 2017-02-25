package es.develex.calculator;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class OperationTest {
    @Test
    public void whenAddOperationExecutedThenCalculatorAccumulatorIsSum() {
        Calculator calculator = new Calculator();

        calculator.setValue(new BigDecimal(22));
        calculator.add(new BigDecimal(18));

        assertEquals(new BigDecimal(40), calculator.getValue());
    }
}
