package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C10Polymorphism {
    public static void main(String[] args) {
        Object o = method();
        String s = o.toString();
        System.out.println(" s= "+ s);
    }


    public static Object method(){
        double r = Math.random();

        if(r < 0.5)
            return " java";



        //object 의 하이타입을 리턴할 수 있다.
        return new Scanner(System.in);
    }
}
