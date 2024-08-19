package ch02.lecture.p05socpe;

public class C01Scope {
    public static void main(String[] args) {
        //{} : 코드 블럭
        // 선언된 변수는 코드 블럭 내에서만 사용가능
        int a =3;
        System.out.println(a);

        if(true){
            int b= 5;
            System.out.println(b);
        }
    }

    public static void method(){
//        System.out.println(a);
    }
}
