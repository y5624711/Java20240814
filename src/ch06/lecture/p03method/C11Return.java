package ch06.lecture.p03method;

public class C11Return {
}

class MyClass11{
    public void method1(){

    }

    //메소드에 return type이 있는 경우
    //꼭 코드 실행 중 return 문이 실행되도록 해야한다.
    public int method2(){
        System.out.println("명령문");
        boolean a = true;
        if(a){
            return 3;
        }else{
            return 4;
        }
    }
}
