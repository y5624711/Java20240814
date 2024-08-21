package ch04.lecture.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 0;

        switch(grade) {
            case 'A', 'a' -> {
                System.out.println("우수회원 전용"); }
            case 'B', 'b' -> {
                System.out.println("일반 회원 입니다.");
            }

            default -> {System.out.println(("손님"));
            }
        }
    }
}
