package ch06.lecture.p08access;

public class C01Access {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.method1();
//         o1.method2();
    }
}

class MyClass01{

    void method1(){
        method2();
    }

    private void method2(){
        System.out.println("다른 곳에서 접근하면 안되는 어떤일...");
    }
}