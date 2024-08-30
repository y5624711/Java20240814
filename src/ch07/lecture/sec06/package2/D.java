package ch07.lecture.sec06.package2;

import ch07.lecture.sec06.package1.A;

public class D extends A {
    public D(){
        super();
    }

    public void method() {
        this.field = "value";
        this.method();
    }

    public void method2(){
        //직접 객체를 생성해서 사용하는것은 안된다.
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
