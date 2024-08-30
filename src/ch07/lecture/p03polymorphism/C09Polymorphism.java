package ch07.lecture.p03polymorphism;

public class C09Polymorphism {
    public static void main(String[] args) {
        MyClass9 o1 = new MyClass9();
        o1.setNumber(new Integer(333));

        MyClass9 o2 = new MyClass9();
        o2.setNumber(new Double(3.14) );
    }

}

class MyClass9 {
    private Number number;

    public void setNumber(Number number){
        this.number = number;

    }

    public void printDoubleNumber() {

        double v = number.doubleValue();

        System.out.println(v);
        System.out.println((number.doubleValue()));
    }
}