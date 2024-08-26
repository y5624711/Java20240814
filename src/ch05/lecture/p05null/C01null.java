package ch05.lecture.p05null;

public class C01null {
    public static void main(String[] args) {
        // null : 참조하는 (가리키는) 객체가 없다.
        String[] a = new String[3];

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        a[0].length(); //  NullPointerException 예외
    }
}
