package ch07.lecture.sec03.exam02;

public class SmartPhone extends Phone{
    //자식생성자 선언
    public SmartPhone(String model, String color){
        super(model,color);
        System.out.println("자식생성자 실행");
    }
}
