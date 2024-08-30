package ch07.lecture.sec05.exam02;

public class SportCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    //재정의 불가
//    public void stop(){
//
//    }
}
