package ch05.lecture.p04string;

public class C12StartWith {
    public static void main(String[] args) {
        String s = "java language";
        int i = s.indexOf("java");

        if(i == 0){
            System.out.println("시작문자열");
        }
        
        //시작문자열판단
        boolean j = s.startsWith("java");
        if(j){
            System.out.println("시작");
        }

        int k = s.indexOf("age");
        System.out.println("k = "+ k);
        System.out.println(s.length() - "age".length());

        //끝 문자열 확인
        boolean l = s.endsWith("age");
        System.out.println("l = " + l);

    }
}
