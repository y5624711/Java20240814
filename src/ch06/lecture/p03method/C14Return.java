package ch06.lecture.p03method;

public class C14Return {

}

//return :
//1. 메소드 종료
//2. 오른쪽값 반환

class MyClass14{
    public int method1(){
        boolean a = true;

        if(a){
            return 3;
        }

        System.out.println("실행문");

        return 0;
    }

    public void method2(){
        //return : 1. 메소드 종료 목적
        boolean a= true;
        if(a){
            return;
        }
        System.out.println("명령문");
    }
}
