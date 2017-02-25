package es.develex.calculator;

import java.math.BigDecimal;

public class MultiplyOperation implements Operation {
    @Override
    public BigDecimal apply(BigDecimal accumulation, BigDecimal factor) {
        return accumulation.multiply(factor);
    }
}
