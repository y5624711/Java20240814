package ch04.lecture.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //java 13 부터 가능
        int score2 = switch(grade){
            case "A"->100;
            case "B" ->{
                int result = 100 -20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score2);
    }
}
