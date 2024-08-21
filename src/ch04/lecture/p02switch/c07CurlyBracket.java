package ch04.lecture.p02switch;

public class c07CurlyBracket {
    public static void main(String[] args) {
        //if else if, else ,case
        // 코드가 한줄일 시 {} 생략가능


        int n = 3;
        switch (n){
            case 1 -> {
                System.out.println(1);
                System.out.println(2);
            }
            //중괄호 생략가능
            case 2 -> System.out.println(3);
        }
    }
}
