package ch07.lecture.Sol;

public class Sol11 {
    public static void main(String[] args) {
        MainAct a = new MainAct();
        a.onCreate();

    }


}

class Act{
    public void onCreate(){
        System.out.println("실행내용");
    }
}

class MainAct extends  Act{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행");
    }
}