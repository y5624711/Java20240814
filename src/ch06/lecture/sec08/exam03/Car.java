package ch06.lecture.sec08.exam03;

public class Car {
    //field
    int gas;

    //리턴값이 없는 메소드로 매개값을 받아서 gas필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;//false를 리턴하고 메소드 종료
        }
        System.out.println("가스가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 :" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
                return;
            }
        }
    }
}
