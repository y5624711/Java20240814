package ch04.lecture.p02switch;

public class C11SwitchExpression {
    public static void main(String[] args) {
        //1~3정수
        int n = (int)(Math.random()*3)+1;

        String g = switch (n){
            case 1-> "일";
            case 2 -> "이";
            case 3 -> "삼";
            default -> "그외";
        };
        System.out.println(g+"등급");
    }
}
