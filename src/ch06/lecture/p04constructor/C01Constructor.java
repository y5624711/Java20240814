package ch06.lecture.p04constructor;

public class C01Constructor {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();

        System.out.println("어떤 main메소스 코드들..");

        MyClass01 p = new MyClass01();

    }
}

class MyClass01{
    //필드(instance field || static field(class field))

    //생성자 constructor
    //객체가 처음 만들어 질 때 해야하는 일들 작성
    // ->주로 필드를 초기화한다

    //생성자명 : 클래스명과 같다.
    // () : 파라미터 목록
    //{} : 실행 코드 (필드 초기화코드)
    MyClass01(){
        System.out.println("실행 코드들...");
    }

    //메소드(instance method || static method(class method))
}