package ch04.lecture.p02switch;

public class C09SwitchExpression {
    public static void main(String[] args) {
        //switch expression 스위치식

        //switch expression 사용 전-
        String message = "";

        String grade = "A";

        switch(grade){
            case "A", "a" -> message = "우수한 등급";

            case "B", "b" -> message = "보통 등급";

            case "C", "c" -> message = "등급 미만";
        }
        System.out.println(message);
    }
}
