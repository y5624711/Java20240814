package ch06.lecture.p05static;

public class C04Method {
    public static void main(String[] args) {
        MyClass04.method();
        double m = Math.random();//스태틱 메소드

        System.out.println(m);

        double f = Math.abs(-99);
        System.out.println(f);
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}

class MyClass04{

    static void method(){
        System.out.println("MyClass04.method");
    }
}
