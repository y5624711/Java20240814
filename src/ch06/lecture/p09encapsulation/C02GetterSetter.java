package ch06.lecture.p09encapsulation;

public class C02GetterSetter {
}
//필드는 특별한 이유가 없다면 private
//필드값 변경 또는 읽기 메소드를 public 으로 맞성
class MyClass02{
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;
    private boolean enable;
    

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    //boolean은 is로 시작
    public boolean isMarried() {
        return married;
    }

    //boolean은 is로 시작
    public boolean isEnable() {
        return enable;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
