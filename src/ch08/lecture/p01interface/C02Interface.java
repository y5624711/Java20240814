package ch08.lecture.p01interface;

public class C02Interface {
    public static void main(String[] args) {
        MyClass11 myClass11 = new MyClass11();
        MyClass12 myClass12 = new MyClass12();
        
        //자동형변환
        MyInterface1 a1 = myClass11;
        MyInterface1 a2 = myClass12;
    }
}

//interface : 여러 클래스의 객체를 하나의 타입으로 묶음


interface MyInterface1{

}

//MyClass11 이 MyInterface1 을 구현했다 (implement)
//구현클래스 (concrete class, 구상 클래스,구체 클래스)
class MyClass11 implements MyInterface1{}

class MyClass12 implements MyInterface1{}