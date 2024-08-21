package ch04.lecture.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
//        for(float x=0.1f;x<=1.0f;x+=0.1f){
//            System.out.println(x);
//        }
        float x = 0.1f;

        while(x <= 1.0f){
            System.out.println(x);

            x+=0.1f;
        }
    }
}
