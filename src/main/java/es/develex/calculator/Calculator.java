package es.develex.calculator;

import java.math.BigDecimal;

public class Calculator {

    private BigDecimal value = BigDecimal.ZERO;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void clear() {
        value = BigDecimal.ZERO;
    }

    public void add(BigDecimal operand) {
    }
}
