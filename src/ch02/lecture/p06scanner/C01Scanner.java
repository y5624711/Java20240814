package ch02.lecture.p06scanner;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        //Scanner : 입력 소스를 훓으며 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력>");
        String str = scanner.nextLine();// 한 줄 입력받음

        System.out.println("출력>"+str);
    }
}
