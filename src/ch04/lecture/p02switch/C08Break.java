package ch04.lecture.p02switch;

public class C08Break {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3)+1;

        switch (n)
        {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
        }
    }
}
