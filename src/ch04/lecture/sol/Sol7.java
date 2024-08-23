package ch04.lecture.sol;

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;


        while(true){
            System.out.println("-----------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------");
            System.out.print("선택 > ");

            int value = scanner.nextInt();

            switch (value)
            {
                case 1->{
                    System.out.println("예금액 > ");
                    balance += scanner.nextInt();
                }
                case 2 ->{
                    System.out.println("출금 > ");
                    balance += scanner.nextInt();
                }
            }
        }
    }
}
