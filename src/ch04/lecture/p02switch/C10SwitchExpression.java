package ch04.lecture.p02switch;

public class C10SwitchExpression {
    public static void main(String[] args) {
        //switch expression 스위치식

        //switch expression 사용
        String grade = "A";

        String message = switch(grade){
            case "A", "a" -> "우수한 등급";

            case "B", "b" -> "보통 등급";

            case "C", "c" -> "등급 미만";
            
            default -> "";//생략불가 필수
        };
        System.out.println(message);
    }
}
