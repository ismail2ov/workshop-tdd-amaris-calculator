package es.develex.calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class OperationTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void whenAddOperationExecutedThenCalculatorAccumulatorIsSum() {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("+");
        calculator.execute(new BigDecimal(18));

        assertEquals(new BigDecimal(40), calculator.getValue());
    }

    @Test
    public void whenSubtractOperationExecutedThenCalculatorAccumulatorIsDifference() {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("-");
        calculator.execute(new BigDecimal(18));

        assertEquals(new BigDecimal(4), calculator.getValue());
    }
}
