package ch05.lecture.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        //특정 위치의 문자열을 잘라오고 싶다.
        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바");
        if(location != -1){
            System.out.println("자바책");
        }else{
            System.out.println("자바책 아님");
        }
        
        //contains : 문자열에 포함되어 있는지 확인
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바책2");
        }else{
            System.out.println("자바책 아님2");
        }
    }
}
