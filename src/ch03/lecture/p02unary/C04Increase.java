package ch03.lecture.p02unary;

public class C04Increase {
    public static void main(String[] args) {
        int a = 10;
        a ++;
        System.out.println(a);


        int c = a++;//사용 후 더함
        System.out.println(c);
        System.out.println(a);

        int d = ++a;//더한 후 사용
        System.out.println(d);


        int e = 11;
        int f = a;
        e++;
        System.out.println(f);
        System.out.println(e);

        e++;
        int g = e;
        System.out.println(g);
        System.out.println(e);
    }
}
