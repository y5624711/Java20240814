package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n","이름등등");
        System.out.printf("형식 문자열 여러개 %s, %s%n","첫번째", "두번째");
        
        //열개의 공간을 차지하고 출력
        System.out.printf("형식 %10s%10s%n","abc","def");
        //왼쪽 정렬
        System.out.printf("형식 %-10s%-10s%n","abc","def");

        //%d : 정수출력(byte, short, int, long)출력
        System.out.printf("정수%d,%d%n", 345, 678);

        //%f : 실수출력(float, double) 출력
        System.out.printf("실수%f,%f%n",3.14, 9.1234);
        System.out.printf("실수%10f,%10f%n",3.14, 9.1234);
        System.out.printf("실수%-10f,%-10f%n",3.14, 9.1234);
        //%0 남은 공간을 0으로 표현
        System.out.printf("실수%010f,%010f%n",3.14, 9.1234);


    }
}
