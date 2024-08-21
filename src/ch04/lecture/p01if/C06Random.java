package ch04.lecture.p01if;

public class C06Random {
    public static void main(String[] args) {
        //임의의 수 리턴
        // 0 <= 수(double) < 1
         double n =Math.random();
        System.out.println(n);


        //목표 1, 2, 3
        // 0 * 3 <= (n*3) < 3
        System.out.println((int)(n*3)+1);//1,2,3
    }
}
