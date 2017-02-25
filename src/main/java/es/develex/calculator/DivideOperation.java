package es.develex.calculator;

import java.math.BigDecimal;

public class DivideOperation implements Operation {
    @Override
    public BigDecimal apply(BigDecimal accumulation, BigDecimal divisor) {
        return accumulation.divide(divisor);
    }
}
