package ch06.lecture.p05static;

public class C03Method {
    public static void main(String[] args) {
        //인스턴스(객체)를 생성후 호출
        MyClass03 o1 = new MyClass03();
        o1.method();
        
        //바로 호출
        MyClass03.method1();
    }

}

class MyClass03{
    void method(){
        System.out.println("MyClass03.method");
    }
    
    
    static void method1(){
        System.out.println("MyClass03.method1");
    }
}
