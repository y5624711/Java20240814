package ch06.lecture.p05static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();

        o1.age = 30;
        o2.age = 40;

        //static은 인스턴스 없이 바로 사용가능
        MyClass01.number = 50;
    }
}

class MyClass01{
    //instance field
    int age;

    // static field(class field, 정적 필드)
    static int number;
}
