package ch05.lecture.p04string;

public class C04IsEmpty {
    public static void main(String[] args) {
        //isEmpty : 길이가 0일때만 true

        String a ="";
        String b = " ";
        String c = "a";

        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
    }
}
