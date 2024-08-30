package ch07.lecture.p05abstract;


//Abstract : 추상적인
public class C01AbstractClass {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();
        horse.walk();

        Bear1 bear1 = new Bear1();
        bear1.walk();

        Mammal1 horse2 = new Horse1();
        horse2.walk();

        //Mammal1 m1 = new Mammal1();
    }
}

//Mammal : 포유류
//abstract class 는 인스턴스를 생성하지 못하는 클래스다
abstract class Mammal1{

    public void walk(){
        System.out.println("걷다");
    }
}

class Horse1 extends Mammal1{

    public void walk(){
        System.out.println("말이 걷다");
    }
}

class Bear1 extends Mammal1{

    public void walk(){
        System.out.println("곰이 걷는다");
    }
}