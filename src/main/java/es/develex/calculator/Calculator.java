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
        Operation op = null;

        switch (operation) {
            case "+":
                op = new AddOperation();
                break;
            case "-":
                op = new SubstractOperation();
                break;
            case "*":
                op = new MultiplyOperation();
                break;
        }

        if (op != null) {
            value = op.apply(value, operand);
        }
    }
}
