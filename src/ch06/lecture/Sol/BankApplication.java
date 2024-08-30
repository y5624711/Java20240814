package ch06.lecture.Sol;


import java.util.Scanner;

public class BankApplication {
    private static Account20[] accountArr = new Account20[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int select;
        boolean power = true;

        while (power) {
            System.out.println("""
                    ---------------------------------------------
                    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                    ---------------------------------------------
                    """);

            System.out.print("선택 > ");
            select = Integer.parseInt(scanner.nextLine());


            switch (select) {
                case 1:
                    creatAccount();
                    break;
                case 2:
                    customerList();
                    break;
                case 3:
                    plusMoney();
                    break;
                case 4:
                    minusMoney();
                    break;
                default:
                    power = false;
                    System.out.println("프로그램 종료");

                    break;
            }
        }
    }

    private static void creatAccount() {

        System.out.println("""
                --------------------
                계좌생성
                --------------------
                """);

        System.out.print("계좌번호 : ");
        String num = scanner.nextLine();
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("초기입금액 : ");
        int money = Integer.parseInt(scanner.nextLine());

        Account20 account = new Account20(num, name, money);

        for (int i = 0; i < accountArr.length; i++) {
            if (accountArr[i] == null) {
                accountArr[i] = account;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }

    }

    private static void customerList() {
        System.out.println("""
                --------------
                계좌목록
                --------------
                """);

        for (int i = 0; i < accountArr.length; i++) {
            if(accountArr[i] != null){
                System.out.print(STR."\{accountArr[i].getAccountNum()} | \{accountArr[i].getName()} | \{accountArr[i].getMoney()}");
                System.out.println();
            }else {
                break;
            }
        }
    }

    private static void plusMoney(){
        String num  = "";
        int money;

        System.out.println("""
                --------------
                예금
                --------------
                """);
        System.out.print("계좌번호 : ");
        num = scanner.nextLine();

        for(int i = 0; i<accountArr.length; i++)
        {
            if(accountArr[i].getAccountNum().equals(num)){
                System.out.print("예금액 : ");
                money = Integer.parseInt(scanner.nextLine());
                accountArr[i].setMoney(accountArr[i].getMoney()+money);
                break;
            }
        }
    }

    private static void minusMoney(){
        String num = "";
        int money;

        System.out.println("""
                --------------
                출금
                --------------
                """);
        System.out.print("계좌번호 : ");
        num = scanner.nextLine();

        for(int i = 0; i<accountArr.length; i++)
        {
            if(accountArr[i].getAccountNum().equals(num)){
                System.out.print("출금액 : ");
                money = Integer.parseInt(scanner.nextLine());
                accountArr[i].setMoney(accountArr[i].getMoney()-money);
                break;
            }
        }
    }
}
