package es.develex.calculator;

import es.develex.calculator.exceptions.DivisionByZeroException;

import java.math.BigDecimal;

public class DivideOperation implements Operation {
    @Override
    public BigDecimal apply(BigDecimal accumulation, BigDecimal divisor) throws DivisionByZeroException {
        if (divisor.equals(BigDecimal.ZERO)) {
            throw new DivisionByZeroException();
        }

        return accumulation.divide(divisor);
    }
}
