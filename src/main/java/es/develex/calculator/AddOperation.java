package es.develex.calculator;

import java.math.BigDecimal;

public class AddOperation implements Operation {
    @Override
    public BigDecimal apply(BigDecimal accumulation, BigDecimal operand) {
        return accumulation.add(operand);
    }
}
