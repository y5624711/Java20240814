package ch08.lecture.p01interface;

public class C03AbstractMethod {
    public static void main(String[] args) {
        MyInterface3 o = new MyClass3();
        o.otherMethod();
        o.otherMethod2();
        o.otherMethod3();
        o.someMethod();
    }
}

interface MyInterface3{
    // 인터페이스 메소드를 만들면
    //항상 public abstract method 이다.
    //{}가 없이 ();으로 끝난다.

    public abstract void someMethod();
    abstract  void otherMethod();
    public void otherMethod2();
    void otherMethod3();
    //void 앞은 생략해도 된다.(항상 public)
}

//인터페이스의 메소드는 전부 다 추상메소드이기에 재정의를 해야한다.
class MyClass3 implements MyInterface3{
    @Override
    public void someMethod() {
    }

    @Override
    public void otherMethod() {
    }

    @Override
    public void otherMethod2() {
    }

    @Override
    public void otherMethod3() {
    }
}

class MyClass32 implements MyInterface3{

    @Override
    public void someMethod() {

    }

    @Override
    public void otherMethod() {

    }

    @Override
    public void otherMethod2() {

    }

    @Override
    public void otherMethod3() {

    }
}