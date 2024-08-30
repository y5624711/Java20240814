package ch06.lecture.Sol;

public class Sol17 {
    public static void main(String[] args) {
        Print17.printerln(10);
        Print17.printerln(true);
        Print17.printerln(5.7);
        Print17.printerln("홍길동");
    }
}

class Print17 {
    static void printerln(int a){
        System.out.println(a);
    }

    static void printerln(boolean a){
        System.out.println(a);
    }
    static void printerln(double a){
        System.out.println(a);
    }
    static void printerln(String a){
        System.out.println(a);
    }
}
