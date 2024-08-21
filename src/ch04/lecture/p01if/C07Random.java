package ch04.lecture.p01if;

import java.util.Random;

public class C07Random {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1;

        Random random = new Random();
        int j =random.nextInt(6) + 1;
        System.out.println(" j = "+ j);
//        if(num >= 6){
//            System.out.println("주사위 6");
//        }else if(num >= 5){
//            System.out.println("주사위 5");
//        }else if(num >=4){
//            System.out.println("주사위 4");
//        }else if(num >=3){
//            System.out.println("주사위 3");
//        }else if(num >=2){
//            System.out.println("주사위 2");
//        }else{
//            System.out.println("주사위 1");
//        }

    }
}
