package ch07.lecture.sec10.exam1;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();


    }
}
