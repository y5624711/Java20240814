package ch06.lecture.p03method;

import java.util.Arrays;

public class C08Varargs {
    //Varargs (variable arguments, 가변길이 매개변수) :
    public static void main(String[] args) {
        MyClass08 o = new MyClass08();
        o.method2();
        o.method2(1);
        o.method2(10, 20);
        o.method2(10, 20, 30, 40, 50);

        System.out.println();
        o.method3();
        o.method3(6, 7, 8);
        o.method3(10, 20, 30, 40);
    }
}

class MyClass08 {
    public void method1() {
        System.out.println("같은일");
    }

    public void method1(int a) {
        System.out.println("같은일");
    }

    public void method1(int a, int b) {
        System.out.println("같은일");
    }

    //Varargs
    public void method2(int... a) {
        System.out.println("메소드2 할 일");
    }

    public void method3(int... a) {
        //a를 배열로 사용가능
        System.out.println(Arrays.toString(a));
        System.out.println("a길이 = " + a.length);
    }
}
