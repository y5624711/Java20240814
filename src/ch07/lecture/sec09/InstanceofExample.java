package ch07.lecture.sec09;

public class InstanceofExample {

    //main에서 바로 호출하기 위한 정적메소드 선언
    public static void personInfo(Person person){
        System.out.println("name : " + person.name);
        person.walk();

        //person이 참조하는 객체가 Student 타입인지 확인
        if(person instanceof  Student){
            //Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            //Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("sutdentNo : " + student.studentNo);
            student.study();
        }

        //true 일 경우 student 변수에 대입(타입변환)
        if(person instanceof  Student student){
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }


    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
