package ch06.lecture.p02field;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 a =new MyClass01();
        MyClass01 b = new MyClass01();

        System.out.println("a = " + a.age);
        System.out.println("b = " + b.age);
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);

        a.age = 55;

        System.out.println(a.age);
        System.out.println(b.age);

        b.name = "키보드";

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//다른 디렉토리에선 동일이름 가능
class MyClass01{
    //field : 각 객체(인스턴스)가 가질 수 있는 값 목록
    int age = 5;
    String name = "모니터";
    
}
