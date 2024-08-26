package ch06.lecture.p01class;

public class C01Class {
    public static void main(String[] args) {
        String a =new String("java");

        // 변수값으로 받아놓지 않으면 가비지 값으로 남는다.
        myClass01 b = new myClass01();
        myClass01 c =new myClass01();

        int codeA = System.identityHashCode(a);
        System.out.println("codeA : " + codeA);

        int codeB = System.identityHashCode(b);
        System.out.println("codeB : " + codeB);

        int codeC = System.identityHashCode(c);
        System.out.println("codeC : " + codeC);
    }
}

//class (설계도) 만들기
class myClass01{

}


