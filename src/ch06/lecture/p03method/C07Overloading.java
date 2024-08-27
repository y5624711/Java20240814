package ch06.lecture.p03method;

//파라미터
public class C07Overloading {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        o1.method1();
        o1.method1(7);
    }
}


class MyClass07 {
    //Method Overloading :
    //파라미터 목록이 다른 같은 이름의 메소드를 작성할 수 있다.
    //파라미터 목록이 다른(갯수, 순서, 타입)이 다르다.

    public void method1() {
        System.out.println("실행문");
    }

    public void method1(int a) {
        System.out.println("메소드2실행문");
    }

    public void method1(int a, int b) {
        System.out.println("메소드2실행문");
    }

    public void method1(String a) {
        System.out.println("메소드2실행문");
    }

    public void method1(int a, String b) {
        System.out.println("메소드2실행문");
    }

    public void method1(String a, int b) {
        System.out.println("메소드2실행문");
    }
}
