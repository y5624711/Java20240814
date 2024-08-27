package ch06.lecture.p03method;

public class C04Method {
    public static void main(String[] args) {
        MyClass4 o1 =  new MyClass4();
        o1.method1();
        o1.method2();
    }
}

class MyClass4{



    public void method1(){
        System.out.println("코드들...");
    }
    public void method2(){
        System.out.println("다른코드들..");
    }
}
