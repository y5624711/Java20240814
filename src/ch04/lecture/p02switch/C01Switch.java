package ch04.lecture.p02switch;

public class C01Switch {
    public static void main(String[] args) {
        //switch(조건문, 분기문)

        //1, 2, 3
        int n = (int)(Math.random()*3) +1;

        //byte, short, char, int, string, enum 값이 들어간다.
        switch (n){
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
        }
    }
}
