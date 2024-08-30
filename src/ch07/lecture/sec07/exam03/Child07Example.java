package ch07.lecture.sec07.exam03;

public class Child07Example {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입변환
        Parent07 parent = new Child07();

        //Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        
        //불가능
//        parent.field2 = "data";
//        parent.method3();
        
        //강제형변환
        Child07 child = (Child07)parent;

        //Child타입으로 필드와 메소드 사용
        child.field1 = "data2";
        child.method3();
    }
}
