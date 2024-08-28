package ch06.lecture.p05static;

public class C05StaticBlock {
}

class MyClass05{
    int age;
    static int number;


    static{
        //static field 초기화
        //복잡한 수식 때문이 아니라면 이런 경우는 거의 없다.
        boolean a= true;
        if(a){
            number = 10;
        }else{
            number = 100;
        }
    }

    MyClass05(){
        //필드 초기화 (instance field)
        age = 5;
    }
}