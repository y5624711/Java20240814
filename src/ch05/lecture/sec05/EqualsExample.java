package ch05.lecture.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2){
            System.out.println("참조 같음");
        }else{
            System.out.println("참조 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("문자열 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("참조 같음3");
        }else{
            System.out.println("참조 다름4");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("문자열 같음 5");
        }
    }
}
