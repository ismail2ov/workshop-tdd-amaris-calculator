package es.develex.calculator;

import java.math.BigDecimal;

public class Calculator {

    private BigDecimal value = BigDecimal.ZERO;
    private String operation;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void clear() {
        value = BigDecimal.ZERO;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void execute(BigDecimal operand) {
        if (operation.equals("+")) {
            Operation op = new AddOperation();
            value = op.apply(value, operand);
        } else if (operation.equals("-")) {
            Operation op = new SubstractOperation();
            value = op.apply(value, operand);
        }
    }
}
