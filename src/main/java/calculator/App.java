package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // “exit” 문자열 입력 전까지 무한으로 계산
        boolean exit = false;
        while (!exit) {

            //첫 번째 숫자 입력받기
            int num1;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            try {
                num1 = Integer.parseInt(sc.nextLine());
                if (num1 < 0) {
                    System.out.println("양의 정수만 입력할 수 있습니다.");
                    continue;
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 값을 입력했을 경우 예외처리
                System.out.println("숫자를 입력해 주세요.");
                continue;
            }

            //두 번째 숫자 입력받기
            int num2;
            System.out.print("두 번째 숫자를 입력하세요: ");
            try {
                num2 = Integer.parseInt(sc.nextLine());
                if (num2 < 0) {
                    System.out.println("양의 정수만 입력할 수 있습니다.");
                    continue;
                }
            } catch (NumberFormatException e) {
                // 숫자가 아닌 값을 입력했을 경우 예외처리
                System.out.println("숫자를 입력해 주세요.");
                continue;
            }

            // 사칙연산 입력받기
            char operator;
            System.out.print("사칙연산 기호를 입력하세요: ");
            String input = sc.nextLine();
            if (input.length() != 1) {
                System.out.println("기호는 한 개만 입력해 주세요.");
                continue;
            } else {
                operator = input.charAt(0);
            }

            //연산 기호 입력 검증
            if ( operator != '+' &&
                 operator != '-' &&
                 operator != '*' &&
                 operator != '/' ) {
                System.out.println("지원하지 않는 연산기호입니다. 다시 입력해 주세요.");
                continue;
            } else if (operator == '/' && num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                continue;
            }

            //연산 수행 및 결과 저장
            calculator.setRecord(calculator.calculate(num1, num2, operator));
            System.out.println("결과: " + calculator.getRecord());

            //exit 입력 시 종료
            System.out.println("메뉴를 선택하세요. \n - exit 입력 시 종료\n - remove 입력 시 가장 먼저 저장된 기록 삭제 및 더 계산하기\n - 그 외 입력 시 더 계산하기 ");
            String finish = sc.nextLine();

            if (finish.equals("exit")) {
                exit = true;
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (finish.equals("remove")) {
                calculator.removeResult();
            }
        }

    }
}


