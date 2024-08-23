package ch05.lecture.Sol;

import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        boolean power = true;
        int score[]= new int[0];
        int studentNum = 0;
        int max = 0;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);



        while(power){
            System.out.println("""
                    -----------------------------------------------
                    1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 | 5.종료
                    -----------------------------------------------
                    """);
            System.out.print("선택 > ");
            int select = Integer.parseInt(scanner.nextLine());

            switch(select){
                case 1:
                    System.out.print("학생 수 > ");
                    studentNum = Integer.parseInt(scanner.nextLine());
                    score = new int[studentNum];
                    break;

                case 2:
                    for(int i = 0; i <studentNum; i++){
                        System.out.print(STR."scores[\{i}] > ");
                        score[i] = Integer.parseInt(scanner.nextLine());

                    }
                    break;

                case 3:
                    for(int i =0; i < score.length; i++){
                        System.out.println(STR."scores[\{i}] : " + score[i]);
                    }
                    break;
                case 4:
                    sum = 0;
                    double average = 0;
                    for(int i =0; i < score.length; i++ ){
                        if(max<score[i]){
                            max = score[i];
                        }
                        sum += score[i];
                    }
                    average = (double)sum/score.length;
                    System.out.println("최고 점수 : "+ max);
                    System.out.println("평균 점수 : " + average);
                    break;
                default:
                    power =false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
