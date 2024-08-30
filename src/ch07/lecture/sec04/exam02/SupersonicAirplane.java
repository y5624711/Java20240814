package ch07.lecture.sec04.exam02;

public class SupersonicAirplane extends AirPlane{
    //상수 선언
    public static final int N0RMAL = 1;
    public static final int SUPERSONIC = 2;

    //상태필드선언
    public int flyMode = N0RMAL;
    
    //메소드 재정의

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행 시작");
        }else{
            //Airplane 객체의 fly 메소드 호출
            super.fly();
        }
    }
}
