package ch07.lecture.sec10.exam1;

public class SmartPhone extends  Phone{

    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
