package ch07.lecture.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c= new C();
        D d =new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        //상속관계 x
//        B b3 = e;
//        C c2 = d;


        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
        System.out.println();
        System.out.println(System.identityHashCode(a1));
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(a3));
        System.out.println(System.identityHashCode(a4));
        System.out.println();
        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(c1));



    }
}

//자동포맷팅 임시로 비활성화
//@fomatter:off
class A{

}

class B extends  A{

}

class C extends  A{

}

class D extends  B{

}

class E extends  C{

}