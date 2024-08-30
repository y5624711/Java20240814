package ch07.lecture.p03polymorphism;

public class C11Polymorphism {
    public static void main(String[] args) {
        Bear11 bear = getBear();
        bear.hunt();
//        bear.swim(); 안전하지 않으니 실행할 수 없다.


        //PolarBear가 리턴되면 실행되게 한다.
        if(bear instanceof PolarBear b){
            b.swim();
        }
    }

    public static Bear11 getBear(){
        double r =Math.random();
        if(r < 0.5){
            return new BrownBear11();
        }
        return new PolarBear();
    }
}

class Bear11{
    public void hunt(){
        System.out.println("사냥한다.");
    }
}
//불곰
class BrownBear11 extends Bear11{
    @Override
    public void hunt() {
        System.out.println("연어를 사냥한다.");
    }
}


class PolarBear extends Bear11{

    @Override
    public void hunt() {
        System.out.println("바다표범을 사냥한다.");
    }

    public void swim(){
        System.out.println("수영한다.");
    }
}
