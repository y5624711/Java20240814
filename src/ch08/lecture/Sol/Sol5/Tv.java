package ch08.lecture.Sol.Sol5;

public class Tv implements Remocon {

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }

    @Override
    public void powerOn() {
        System.out.println("tv를 켰습니다.");
    }
}
