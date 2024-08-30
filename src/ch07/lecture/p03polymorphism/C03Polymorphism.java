package ch07.lecture.p03polymorphism;

public class C03Polymorphism {
    public static void main(String[] args) {
        Super03 domi = new Sub031(); //도미객체
        Super03 tuna = new Sub032(); //참치객체

        //실제 인스턴스의 메소드가 실행됨
        domi.eat();
        tuna.eat();
    }
}

class Super03 {
    //어류

    public void eat() {
        System.out.println("먹이를 먹다");
    }
}

class Sub031 extends Super03 {
    //도미


    @Override
    public void eat() {
        System.out.println("미역 먹음");
    }
}

class Sub032 extends Super03 {
    //참지

    @Override
    public void eat() {
        System.out.println("작은 물고기 먹음");
    }
}