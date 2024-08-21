package ch04.lecture.p02switch;

public class C04Switch {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 6) +1;

        switch (n){
            case 1:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;
            case 3:
                System.out.println("홀수");
                break;
            case 4:
                System.out.println("짝수");
                break;
            case 5:
                System.out.println("홀수");
                break;
            case 6:
                System.out.println("짝수");
                break;

        }
    }
}
