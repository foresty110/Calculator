package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //연산 결과를 저장하는 컬렉션 타입 필드
    public List<Double> record = new ArrayList<>();

    //TODO
    // [ ]  연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    public Double calculate(int num1, int num2, char operator) {

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

}
