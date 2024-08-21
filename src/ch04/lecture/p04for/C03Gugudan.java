package ch04.lecture.p04for;

public class C03Gugudan {
    public static void main(String[] args) {
        //홀수단만 출력
        for(int i = 3; i<=9; i+=2){
            System.out.println(STR."\{i}단 ************");
            for(int j = 1; j <= 9; j++){
                System.out.println(STR."\{i} x \{j} = \{i * j}");
            }
        }
    }
}
