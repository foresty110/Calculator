package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number> { // <T extends Number,S extends Number>{

    //연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> record = new ArrayList<>();

    public double getRecord() {
        return record.get(record.size() - 1);
    }

    public void setRecord(double recordValue) {
        this.record.add(recordValue);
    }

    //피연산자를 여러 타입으로 받을 수 있도록 기능을 확장

    public double calculate(T num1, T num2, OperatorType operator) {

        double result = 0;

        switch (operator) {
            case ADD:
                result = num1.doubleValue() + num2.doubleValue();
                break;
            case SUBTRACT:
                result = num1.doubleValue() - num2.doubleValue();
                break;
            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;
            case DIVIDE:
                result = num1.doubleValue() / num2.doubleValue();
                break;
        }
        return result;

    }


    public void saveAndCalculate(T num1, T num2, OperatorType operator) {

        double result = this.calculate(num1, num2, operator);

        this.setRecord(result);
    }

    public void removeResult() {

        if (!record.isEmpty()) {
            System.out.println("가장 먼저 기록된 값 '" + record.get(0) + "'을 삭제합니다.");
            record.remove(0);
        } else {
            System.out.println("삭제할 데이터가 없습니다.");
        }

    }

    public void findResult(double target) {
        if (!record.isEmpty()) {
            List<Double> findNum = this.record.stream()
                    .filter(x -> x > target)
                    .toList();
            System.out.println(findNum);
        }
    }
}
