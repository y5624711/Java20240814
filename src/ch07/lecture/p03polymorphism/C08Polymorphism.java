package ch07.lecture.p03polymorphism;

public class C08Polymorphism {
    public static void main(String[] args) {
        Fish f = new Fish();
        Bear8 b = new Bear8();
        living(f);
        living(b);


    }

    public static void living(Animal8 a){
        a.breathe();
//        a.swim();
//        a.hunt();
    }
}

class Animal8 {
    public void breathe(){
        System.out.println("동물이 숨쉬다.");
    }
}

class Fish extends Animal8 {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }
    
    public void swim(){
        System.out.println("수영");
    }
}

class Bear8 extends  Animal8{
    @Override
    public void breathe() {
        System.out.println("폐호흡");
    }

    public void hunt(){
        System.out.println("사냥하다.");
    }
}