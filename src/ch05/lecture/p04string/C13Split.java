package ch05.lecture.p04string;

public class C13Split {
    public static void main(String[] args) {
        //split  : 문자열을 나누는 메소드

        String s = "java,css,spring,react";
        String[] s1 = s.split(",");

        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println(s1[2]);
        System.out.println(s1[3]);

        String u = "java css html";
        String[] v = u.split(" ");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
    }
}
