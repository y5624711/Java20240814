package ch05.lecture.p02reference;

public class C08Parameter {
    public static void main(String[] args) {
        int b = 5;
        method1(b);
        System.out.println("1 :" +b);
    }

    public  static void method1(int a){
        System.out.println("2 : "+a);
        a = 55;
        System.out.println("3 : "+a);
    }
}
