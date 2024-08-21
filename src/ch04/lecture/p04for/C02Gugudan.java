package ch04.lecture.p04for;

public class C02Gugudan {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++){
            System.out.println(STR."\{i}단 *******************");
            for(int y = 1; y <= 9; y++){
                System.out.println( STR."\{i} X \{y} = \{i * y}");
            }
        }
    }
}
