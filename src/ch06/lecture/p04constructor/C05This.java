package ch06.lecture.p04constructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        MyClass05 b = new MyClass05();
        a.name = "son";
        b.name = "lee";

        a.printName();
        b.printName();
        System.out.println();
        a.printFullDescription();
        b.printFullDescription();
    }
}

class MyClass05{
    int score;
    String name;

    MyClass05(){

    }

    //메소드
    void printName(){
        System.out.println(this.name);
    }

    void printFullDescription(){
        this.printName();
        System.out.println(this.score);
    }
}
