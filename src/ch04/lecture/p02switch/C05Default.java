package ch04.lecture.p02switch;

public class C05Default {
    public static void main(String[] args) {
        int n = (int)(Math.random()* 10)+1;
        System.out.println("n");
        
        switch (n){
            case 5, 10:
                System.out.println("5의 배수");
            case 3, 6, 9: 
                System.out.println("3의 배수");
            default:
                System.out.println("그 외의 수");
        }
    }
}
