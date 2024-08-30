package ch07.lecture.p04cast;

public class C04InstanceOf {
    public static void main(String[] args) {
        //instanceof
        //결과 : boolean
        // 왼쪽항 : 참조변수
        // 오른쪽항 : 타입(클래스, 인터페이스)
        //왼쪽의 참조변수가 가리키는 인스턴스가 오른쪽 타입이면 true

        A a = new A();
        System.out.println("A객체");
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(a instanceof E);
        System.out.println(a instanceof F);
        System.out.println();
        
        B b =new B();
        System.out.println("B객체");
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
//        System.out.println(b instanceof C);//false
        System.out.println(b instanceof D);
        System.out.println(b instanceof E);
//        System.out.println(b instanceof F);//false
        System.out.println();
        
        D d = new D();
        System.out.println("D객체");
        System.out.println(d instanceof A);
        System.out.println(d instanceof B);
//        System.out.println(d instanceof C);
        System.out.println(d instanceof D);
//        System.out.println(d instanceof E);
//        System.out.println(d instanceof F);
        System.out.println();

        A z = new F();
        System.out.println("F객체를 A타입 변수에");
        System.out.println(z instanceof A);
        System.out.println(z instanceof B);//false
        System.out.println(z instanceof C);
        System.out.println(z instanceof D);//false
        System.out.println(z instanceof E);//false
        System.out.println(z instanceof F);

    }
}

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends B {}

class F extends C {}