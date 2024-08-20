package ch03.lecture.p04logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        //||는 앞부분이 true or false 일경우 계산을 빠져나와 끝낸다.
        System.out.println((a++) > 0 || (b++)>0);
        System.out.println("a = "+ a);
        System.out.println("b = " + b);

        int c = 5;
        int d = 5;
        System.out.println((c++) > 0 | (d++) > 0);
        System.out.println("c = " +c );
        System.out.println("d = "+ d);

    }
}
