package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C07Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력");
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();

        System.out.println(v1+v2);
    }
}
