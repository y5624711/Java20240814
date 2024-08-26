package ch05.lecture.Sol;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean power = true;
        int select = 0;
        int studentCount = 0;
        int[] scores= new int[]{};
        int sum = 0;
        int maxValue = 0;
        double avg = 0;

        Scanner scanner = new Scanner(System.in);


        while(power)
        {
            System.out.println("""
                    -----------------------------------------------
                    1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 | 5.종료
                    -----------------------------------------------
                    """);
            System.out.print("선택 > ");
            select = scanner.nextInt();

            switch(select)
            {
                case 1 :
                    System.out.print("학생 수 > ");
                    studentCount = scanner.nextInt();
                    scores = new int[studentCount];
                    break;
                case 2:

                    for(int i = 0; i < studentCount; i++)
                    {
                        System.out.print(STR."scores[\{i}] > ");
                        scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for(int i =0; i<scores.length; i++)
                    {
                        System.out.println(STR."scores[\{i}]"+scores[i]);
                    }
                    break;
                case 4:
                    maxValue = 0;
                    avg = 0;
                    sum = 0;

                    for(int i =0; i<scores.length; i++){
                        if(maxValue < scores[i]){
                            maxValue = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = (double) sum/scores.length;
                    System.out.println("최고 점수 : "+maxValue);
                    System.out.println("평균 점수 : " +avg);
                    break;

                default:
                    power = false;
                    System.out.println("프로그램 종료");
                    break;

            }

        }
    }
}
