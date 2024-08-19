package ch02.lecture.p04conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        //실수 간 변환
        //float(4), double(8)
        float a =3.14F;
        double b = a; //자동 형변환

        double c =3.14;
        float d = (float)c; //강제

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
