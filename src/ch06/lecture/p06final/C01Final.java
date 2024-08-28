package ch06.lecture.p06final;

public class C01Final {
    // final : 변수의 값을 바꾸지 못하게 하는 키워드
    //         ->변수에 값을 한번만 할당할 수 있음

    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);

        a = 4;// 변경가능
        System.out.println(a);

        final int b;
        b = 30;
        System.out.println(b);

        //변경 불가
//        b = 40;
    }
}
