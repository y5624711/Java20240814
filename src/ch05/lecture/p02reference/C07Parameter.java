package ch05.lecture.p02reference;

public class C07Parameter {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4},
                {5, 7}
        };
        System.out.println("1 : "+arr[0][0]);
        method1(arr);
        System.out.println("2 : "+arr[0][0]);

    }

    public static void method1(int[][] b){
        System.out.println("3 : "+b[0][0]);

        //참조값의 주소를 변경시킨다.
        b[0] = new int[]{33, 44};
        System.out.println("4 :"+b[0][0]);
    }
}
