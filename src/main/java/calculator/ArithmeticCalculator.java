package calculator;

import java.util.ArrayList;
import java.util.List;

//Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용 해봅니다.
 enum OperatorType {
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

public class ArithmeticCalculator {

    //연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> record = new ArrayList<>();

    public Double getRecord() {
        return record.get(record.size() - 1);
    }

    public void setRecord(double recordValue) {
        this.record.add(recordValue);
    }

    public Double calculate(int num1, int num2, OperatorType operator) {

        double result = 0;

        switch (operator) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = (double) num1 / num2;
                break;
        }

        return result;
    }

    public void removeResult() {

        if (!record.isEmpty()) {
            System.out.println("가장 먼저 기록된 값 '" + record.get(0) + "'을 삭제합니다.");
            record.remove(0);
        } else {
            System.out.println("삭제할 데이터가 없습니다.");
        }

    }
}
