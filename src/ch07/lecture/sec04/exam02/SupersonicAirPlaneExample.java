package ch07.lecture.sec04.exam02;

public class SupersonicAirPlaneExample {
    public static void main(String[] args) {
        SupersonicAirplane s = new SupersonicAirplane();
        s.takeoff();
        s.fly();
        s.flyMode = SupersonicAirplane.SUPERSONIC;
        s.fly();
        s.flyMode = SupersonicAirplane.N0RMAL;
        s.fly();
        s.land();
    }
}
