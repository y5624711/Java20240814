package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        //연산결과의 타입은 피연산자 중 큰 타입으로 결정
        //ex
        int a =3;
        long b =5L;

        //int c =a + b; <-xxx
        long d = a + b;

        long e =7L;
        double f = 3.14;
//        long g = e + f;
        double h =  e + f;


        //나누기 (/) : 정수끼리 연산결과는 정수
        System.out.println(10/3);
        //나누기 (/) : 실수끼리의 연산결과는 실수
        System.out.println(10.0/3.0);//3.3333
        //정수와 실수끼리의 연산결과는 실수
        System.out.println(10/ 3.0);//3.3333
    }
}
