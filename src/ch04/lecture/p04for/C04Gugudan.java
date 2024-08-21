package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
        
        //역순 구구단
        for(int i = 9; i >= 2; i--){
            for(int j = 1; j <= 9; j++){
                System.out.println(STR."\{i} x \{j} = \{i * j}");
            }
        }
    }
}
