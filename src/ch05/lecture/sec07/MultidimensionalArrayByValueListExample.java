package ch05.lecture.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80,90,96},
                {76, 88}
        };

        System.out.println("1차원 배열 길이(반의 수) :  " + scores.length);

        System.out.println("2차원 배열 길이(첫 번째 반의 학생의 수_) : "+scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생의 수_) : "+scores[1].length);

        System.out.println("scores[0][2] : " + scores[0][2]);
        System.out.println("scores[1][1] : " + scores[1][1]);

        int class1Sum = 0;
        for(int i = 0; i <scores[0].length; i++){
            class1Sum += scores[0][i];
        }

        double class1Avg = (double)class1Sum / scores.length;
        System.out.println("첫 번째 반 평균 점수 :  " + class1Avg);

        int class2Sum = 0;
        for(int i=0; i< scores[1].length; i++){
            class2Sum += scores[1][i];
        }
        double class2Avg = (double)class2Sum/scores[1].length;
        System.out.println("두번째 반의 평균 : "+class2Avg);

        int totalStudent = 0;
        int totalSum = 0;

        for(int i =0; i <scores[i].length; i++){
            totalStudent =  scores[i].length;
            for(int k =0; k < scores[i].length; k++){
                totalSum += scores[i][1];
            }
        }
        
        double TotalAvg  = (double) totalSum/totalStudent;
        System.out.println("전체 학생수의 평균");



    }
}
