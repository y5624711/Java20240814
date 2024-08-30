package ch07.lecture.sec04.exam01;

public class Computer extends Calculator {

    //제대로 오버라이딩 되었는지 체크해줌
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer.areaCircle 실행");
        return Math.PI * r * r;
    }
}
