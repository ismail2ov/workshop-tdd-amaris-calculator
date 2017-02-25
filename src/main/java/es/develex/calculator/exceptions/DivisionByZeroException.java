package es.develex.calculator.exceptions;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException() {
        super();
    }

    public DivisionByZeroException(String s) {
        super(s);
    }
}
