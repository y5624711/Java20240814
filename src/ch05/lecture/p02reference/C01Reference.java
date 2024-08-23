package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int[] arr;//참조변수

        a = 3;
        // new 연산자는 RAM(memory)영역 공간에
        // 새로운 값이 저장될 객체(instance)를 마련하고 값을 데이터의 저장 참조값을 생성한다.
        //즉 아래의 대입은 값이 직접 들어가는게 아닌 참조(주소)값이 arr 에 대입되는 것
        arr = new int[]{5,6};

        System.out.println(a);
        System.out.println(arr);// 주소값 출력
        System.out.println(System.identityHashCode(arr));//참조값 확인

        int b;
        b = a;

        // brr는 arr와 같은 주소값을 대입 받는다.
        int[] brr;
        brr = arr;

        arr[0] = 50;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);
    }
}
