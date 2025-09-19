package calculator;

public enum OperatorType {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {  // 생성자
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
