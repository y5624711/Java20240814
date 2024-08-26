package ch05.lecture.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13){
            System.out.println("수가 맞음");
        }else {
            System.out.println("안맞음");
        }
    }
}
