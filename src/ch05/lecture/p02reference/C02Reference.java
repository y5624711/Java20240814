package ch05.lecture.p02reference;

public class C02Reference {
    public static void main(String[] args) {
        int[] arr = /*new instance*/{7,8};  //<-new 생략
        int[] brr = {7,8};
        int[] crr = arr;

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);
        System.out.println("crr[0] = " + crr[0]);

        arr[0] = 71;
        brr[0] = 72;
        crr[0] = 73;

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);
        System.out.println("crr[0] = " + crr[0]);
    }
}
