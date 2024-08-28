package ch06.lecture.p06final;

public class C04InstanceField {
    public static void main(String[] args) {

    }
}

class MyClass04{
    int a;

    final int b ;
    final int c;

    // final instance field(변수)는 생성자에서 (또는 직접) 초기화 해야함
    MyClass04(){
        b = 90;
        c = 9;
    }

    MyClass04(String a){
        b = 20;
        c = 99;
    }
}
