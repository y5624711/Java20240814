package ch07.lecture.p04cast;

public class C01Cast {
    public static void main(String[] args) {
        Parent1 o = new Child1(); // 자동형변환
        Child2 p = new Child2();
        Parent1 q = p;// 자동형변환

//        Child1 r = o; // X
        Child1 r = (Child1) o;//강제형변환
//        Child2 s =q; // X
        Child2 s =(Child2) q;// 강제형변환


    }
}

class Parent1{}

class Child1 extends  Parent1{}

class Child2 extends  Parent1{}
