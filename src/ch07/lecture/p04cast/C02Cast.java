package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Child21();
        Child21 c = (Child21) p;// 강제형변환 - 문제없음

        Parent2 q = new Child22();
        //프로그램이 강제 종료될 수 있음
        Child21 d = (Child21) q;//강제 형변환 -오류 발생

        System.out.println("프로그램 종료");
    }
}

//@formatter : off

class Parent2 {}
class Child21 extends Parent2{}
class Child22 extends  Parent2{}