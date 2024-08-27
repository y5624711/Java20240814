package ch06.lecture.p03method;

public class C13Return {
    public static void main(String[] args) {
        MyClass13 a = new MyClass13();
        a.makeDouble(5);
        
        String s = a.makeTriple("손");
        System.out.println(s);
    }
}

class MyClass13 {
    public int makeDouble(int a) {
        int b = a * 2;
        return b;
    }


    public String makeTriple(String a){
        return a+a+a;
    }

}
