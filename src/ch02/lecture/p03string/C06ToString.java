package ch02.lecture.p03string;

public class C06ToString {
    public static void main(String[] args) {


        //기본타입을 String으로 변환
        //String.valueOf
        //"" 빈 문자열과 + 연결연산
        int a = 33;
        String b = String.valueOf(a);//33
        String c = "" + a;
        String d = a + "";
    }
}
