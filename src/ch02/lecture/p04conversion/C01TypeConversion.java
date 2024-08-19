package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        //형 변환 (type conversion)
        
        //자동 : 작은 공간의 값 -> 큰 공간
        //정수형 사이
        int a =30000;
        long b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //강제 : 큰 공간의 값 -> 작은 공간
//        short c = a; 자동형 변환X
        short c = (short) a; // 변환할 자료형을 앞에 넣어준다
        System.out.println("c = " + c);
        
        int d = 210000000;
        short e = (short) d;//강제 형변환, 값을 잃는다
        System.out.println("e = " + e);

    }
}
