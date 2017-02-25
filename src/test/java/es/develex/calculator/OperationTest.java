package es.develex.calculator;

import es.develex.calculator.exceptions.DivisionByZeroException;
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
    public void whenAddOperationExecutedThenCalculatorAccumulatorIsSum() throws Exception {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("+");
        calculator.execute(new BigDecimal(18));

        assertEquals(new BigDecimal(40), calculator.getValue());
    }

    @Test
    public void whenSubtractOperationExecutedThenCalculatorAccumulatorIsDifference() throws Exception {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("-");
        calculator.execute(new BigDecimal(18));

        assertEquals(new BigDecimal(4), calculator.getValue());
    }

    @Test
    public void whenMultiplicationOperationExecutedThenCalculatorAccumulatorIsProduct() throws Exception {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("*");
        calculator.execute(new BigDecimal(18));

        assertEquals(new BigDecimal(396), calculator.getValue());
    }

    @Test
    public void WhenDivideOperationExecutedThenCalculatorAccumulatorIsFraction() throws Exception {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("/");
        calculator.execute(new BigDecimal(2));

        assertEquals(new BigDecimal(11), calculator.getValue());
    }

    @Test(expected = DivisionByZeroException.class)
    public void whenDivideByZeroThenThrowsDivisionByZeroException() throws Exception {
        calculator.setValue(new BigDecimal(22));
        calculator.setOperation("/");
        calculator.execute(new BigDecimal(0));
    }
}
