package ch07.lecture.sec06.package1;

public class B {
    public void method(){
        A a = new A();
        a.field = "value";//ok
        a.method();//ok
    }
}
