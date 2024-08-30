package ch07.lecture.p06final;

public class C01FinalMethod {
}

class Fish1{

    //final method : 자식 클래스에서 재정의 못하게함
    final public void breath(){
        System.out.println("아가미 호흡");
    }
    public void swim(){
        System.out.println("헤엄친다.");
    }
}
class Domi1 extends Fish1{

    @Override
    public void swim() {
        System.out.println("천천히 헤엄친다.");
    }
}

class Tuna1 extends Fish1{
    @Override
    public void swim() {
        System.out.println("빠르게 헤엄친다.");
    }
}