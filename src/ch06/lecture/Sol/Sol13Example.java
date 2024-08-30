package ch06.lecture.Sol;

public class Sol13Example {
    public static void main(String[] args) {
        Sol13_Encapsulation member = new Sol13_Encapsulation();

        member.setId("lee");
        member.setName("손흥민");
        member.setPassword("1234");
        member.setAge(24);

        System.out.println(member.getId());
        System.out.println(member.getAge());
        System.out.println(member.getName());
        System.out.println(member.getPassword());
    }
}
