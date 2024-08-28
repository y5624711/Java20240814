package ch06.lecture.p05static;

import java.io.PrintStream;

public class C02Field {
    public static void main(String[] args) {
        MyClass02.age = 60;
        MyClass02.name = "son";

        System.out.println(MyClass02.age);
        System.out.println(MyClass02.name);

        System.out.println(System.err);
    }
}

class MyClass02 {
    static int age;
    static String name;
}