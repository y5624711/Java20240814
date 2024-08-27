package ch06.lecture.p03method;

public class C05Parameter {
    public static void main(String[] args) {
        MyClass05 a =new MyClass05();
        a.method2(5);
        a.method3(19,"카리나");
        a.method3(99,"무천도사");
    }
}



class MyClass05{


    //() : 파라미터(parameter, 인자, 매개변수) 목록
    //argument(인수)
    //(변수타입 파라미터명, 변수타입 파라미터명...)
    public void method1(int age,String myName, int[] scores, String[] studentName){
        //변수 선언, 값 대입, 제어문, 연산식 ...

    }

    public void method2(int age){
        System.out.println("실행 코드들");
    }

    public void method3(int age, String name){
        System.out.println(STR."\{age}세 \{name}님");
    }
}