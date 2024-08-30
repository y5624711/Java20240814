package ch07.lecture.p05abstract;

public class C02AbstractMethod {
    public static void main(String[] args) {
        Mammal2 a = new Bear2();
        Mammal2 b = new Horse2();

        a.walk();
        b.walk();
    }
}

//abstract method(추상 메소드)
//코드 블럭이 없는 메소드
//추상메소드를 가진 클래스는 추상클래스여야 한다.

abstract class Mammal2 {

    //상속받은 클래스들이 이 메소드를 가지고 있어야한다는 것이다.
    //상속받은 클래스들은 이 추상메소드를 재정의 하지 않으면 컴파일 오류가 뜬다.
    abstract public void walk();
}

class Bear2 extends Mammal2 {

    @Override
    public void walk() {
        System.out.println("곰이 걷는다");
    }
}

class Horse2 extends Mammal2 {
    @Override
    public void walk() {
        System.out.println("말이 걷는다.");
    }
}