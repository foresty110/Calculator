package calculator;

import java.util.ArrayList;
import java.util.List;

public class IntegerCalculator implements Calculator{

    //연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> record = new ArrayList<>();

    public double getRecord() {
        return record.get(record.size() - 1);
    }

    public void setRecord(double recordValue) {
        this.record.add(recordValue);
    }

    public double calculate(int num1, int num2, char operator) {

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("연산 기호가 입력되지 않았습니다.");
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
