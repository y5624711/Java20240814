package ch03.lecture.sol;

public class Sol5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        //(윗변 + 아랫변) * 높이 /2
        double area = (lengthTop + lengthBottom) * height /2;
        System.out.println(area);
    }
}
