package calculator;

import java.util.List;

public class Calculator {

    //연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> record;

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
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("지원하지 않는 연산기호입니다. 다시 입력해 주세요.");
                break;
        }
        return result;
    }

}
