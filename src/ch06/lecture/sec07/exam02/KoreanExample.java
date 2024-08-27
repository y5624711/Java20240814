package ch06.lecture.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //korean 객체 생성
        Korean kr  = new Korean("박자바","011225-1234567");

        //korean 객체 데이터 읽기
        System.out.println("kr.nation : " + kr.nation);
        System.out.println("kr.name : " + kr.name);
        System.out.println("kr.ssn : " + kr.ssn);
        System.out.println();

        //또 다른 korean 객체 생성
        Korean kr2 = new Korean("김자바","930525-0654321");

        System.out.println("kr2.nation : " + kr2.nation);
        System.out.println("kr2.name : " + kr2.name);
        System.out.println("kr2.ssn : " + kr2.ssn);
    }
}
