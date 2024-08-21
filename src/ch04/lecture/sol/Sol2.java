package ch04.lecture.sol;

public class Sol2 {
    public static void main(String[] args) {

        String grade = "B";

        int score1 = switch (grade){
            case "A" -> score1 = 100;
            case "B" ->{
                int result = 100 - 20;
                score1 = result;
                yield  result;
            }
            default -> 60;
        };
        System.out.println(score1);
    }
}
