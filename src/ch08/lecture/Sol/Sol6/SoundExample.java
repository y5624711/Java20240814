package ch08.lecture.Sol.Sol6;

public class SoundExample {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());

    }

    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
}
