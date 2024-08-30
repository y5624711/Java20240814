package ch07.lecture.p01inheritance;

public class C02Inheritance {
    public static void main(String[] args) {

    }
}

class ParentClass02 {
    private String name;
    private int age;

    ParentClass02(String name, int age){
        this.name =name;
        this.age = age;
    }

}

class ChildClass02 extends ParentClass02 {

    ChildClass02(String name, int age){
        //부모클래스 필드에 접근할 수 없기 때문에
//        this.name;
//        this.age;

        //자식 클래스 생성자에서는 꼭
        // 부모클래스 생성자를 호출해서 필드 초기화 해야한다.
        super(name,age);


    }

    void method(){
        //private 필드 접근 불가
//        this.name = "a";
//        this.age = 99;
    }
}