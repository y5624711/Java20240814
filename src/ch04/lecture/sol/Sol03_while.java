package ch04.lecture.sol;

public class Sol03_while {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i <= 100){
            if(i%3 == 0){
                sum+= i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
