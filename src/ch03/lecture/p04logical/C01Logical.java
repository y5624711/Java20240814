package ch03.lecture.p04logical;

public class C01Logical {
    public static void main(String[] args) {
        //논리연산자
        //and, or, xor, not

        //and(&&) ampercend
        //두 피연산자가 모두 true 일 때만 결과 true
        //그 외에는 false

        System.out.println("and--------------------------");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);


        //or(||)(|)
        //두 피연산자가 모두 false 일 때만 결과 false
        //그 외에는 true
        System.out.println("or----------------------------");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);


        //xor(^)-caret
        //두 피연산자가 다르면 true, 같으면 false
        System.out.println("xor----------------------------");
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);
        
        //not(!)
        //결과는 피연산자의 반대
        System.out.println("not----------------------------");
        System.out.println(!true);
        System.out.println(!false);
    }
}
