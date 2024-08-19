package ch02.lecture.sec12;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품가격 : %d원\n",value);
        System.out.printf("상품가격 : %6d원\n",value);
        System.out.printf("상품가격 : %-6d원\n",value);
        System.out.printf("상품가격 : %06d원\n",value);

        double area = 3.14149 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n",1 ,name ,job);
    }
}
