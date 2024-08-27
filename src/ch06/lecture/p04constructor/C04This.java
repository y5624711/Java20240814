package ch06.lecture.p04constructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(10,"홍길동");
        System.out.println(o.age);
        System.out.println(o.name);
        
        MyClass04 p = new MyClass04(55, "손흥민");
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

//this : 이 클래스로 만들어진 객체의 참조값
class MyClass04{
    int age;
    String name;

    MyClass04(int age, String name){
        this.age = age;
        this.name = name;
    }
}
