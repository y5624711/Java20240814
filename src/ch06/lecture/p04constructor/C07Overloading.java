package ch06.lecture.p04constructor;

public class C07Overloading {
    public static void main(String[] args) {
        MyClass07 o = new MyClass07(1, 30, "son","seoul");
        MyClass07 p = new MyClass07(2, 25);
        MyClass07 q = new MyClass07("lee", "london");
    }
}

class MyClass07{
    int id;
    int age;
    String name;
    String address;

    MyClass07(int id, int age, String name, String address){
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    MyClass07(int id, int age){
        this.id = id;
        this.age = age;
    }

    MyClass07(String name, String address){
        this.name = name;
        this.address = address;
    }
}