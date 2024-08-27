package ch06.lecture.p03method;

import java.util.Arrays;

public class C06Parameter {
    public static void main(String[] args) {
        MyClass06 a = new MyClass06();
        int v = 10;
        a.method1(v);//실행,호출

        int[] b= {9,3,1};
        a.method2(b);
        System.out.println("b[0] = " + b[0]);

        int[] c = {8,9};
        a.method2(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c) );

        int z = 8;
        a.method1(z);
        System.out.println(z);
    }
}


class MyClass06 {
    
    
    //메소드 정의
    public void method1(int a) {
        System.out.println(a);
        a = 88;
    }

    public void method2(int[] a){
        System.out.println(Arrays.toString(a));
        a[0]=99;
    }
}
