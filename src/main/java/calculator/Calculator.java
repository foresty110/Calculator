package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //첫 번째 숫자 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = Integer.parseInt(sc.nextLine());


        //두 번째 숫자 입력받기
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = Integer.parseInt(sc.nextLine());

        // 사칙연산 입력받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);
    }
}
