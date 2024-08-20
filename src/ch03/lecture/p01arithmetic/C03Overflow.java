package ch03.lecture.p01arithmetic;

public class C03Overflow {
    public static void main(String[] args) {
        //overflow : 허용된 범위를 넘게 되어 의도하지 않은 값을 가지게됨

        int money = 0;//-21억 ~ 21억
        money = money + 1000000000;
        System.out.println("money = "+money);

        money = money + 1000000000;
        System.out.println("money = "+money);

        money = money + 1000000000;
        System.out.println("money = "+money);
    }
}
