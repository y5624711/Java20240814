package ch07.lecture.sec03.exam01;

public class SmartPhone extends Phone{

    //자식생성자 선언
    public SmartPhone(String model, String color){
        super();
        this.model =model;
        this.color =color;
        System.out.println("SmartPhone 생성자 실행됨");
    }
}
