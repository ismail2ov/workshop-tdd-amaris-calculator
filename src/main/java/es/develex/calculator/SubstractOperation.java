package es.develex.calculator;

import java.math.BigDecimal;

public class SubstractOperation implements Operation {
    @Override
    public BigDecimal apply(BigDecimal accumulation, BigDecimal operand) {
        return accumulation.subtract(operand);
    }
}
