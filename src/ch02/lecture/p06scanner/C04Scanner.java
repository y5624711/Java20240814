package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        //실수 두 개 입력 받아서 더한값 출력하기
        Scanner scanner = new Scanner(System.in);

        System.out.print("값1 : ");
        String num1 = scanner.nextLine();

        System.out.print("값2 : ");
        String num2 = scanner.nextLine();

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        System.out.println("더하기 : " + (n1+n2));
    }
}
