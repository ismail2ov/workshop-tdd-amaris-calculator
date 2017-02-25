package es.develex.calculator;

import java.math.BigDecimal;

public interface Operation {
    BigDecimal apply(BigDecimal accumulation, BigDecimal operand);
}
