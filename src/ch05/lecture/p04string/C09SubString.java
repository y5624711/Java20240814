package ch05.lecture.p04string;

public class C09SubString {
    public static void main(String[] args) {
        //subString : 부분 문자열 추출
        //원본 문자열 추출 안됨

        String s = "java programming language";

        //시작숫자, 끝숫자 - 1
        String s1 =  s.substring(5,8);
        System.out.println(s);
        System.out.println(s1);
        //17부터 끝까지
        System.out.println(s.substring(17));

    }
}