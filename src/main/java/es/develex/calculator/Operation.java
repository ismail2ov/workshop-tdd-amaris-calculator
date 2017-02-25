package es.develex.calculator;

import es.develex.calculator.exceptions.DivisionByZeroException;

import java.math.BigDecimal;

public interface Operation {
    BigDecimal apply(BigDecimal accumulation, BigDecimal operand) throws DivisionByZeroException;
}
