package ch05.lecture.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

//        System.out.println("mathScores.legnth = " + mathScores.length);

        for(int i=0; i < mathScores.length; i++)
        {
            for(int k=0; k <mathScores[i].length; k++){
                System.out.println(STR."mathScores[\{i}][\{k}] : " + mathScores[i][k]);
            }
        }

        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;

        for(int i=0; i < mathScores.length; i++){
            totalStudent += mathScores[i].length;
//            System.out.println("student = "+totalStudent);

            for(int k = 0; k < mathScores[i].length; k++){
                totalMathSum += mathScores[i][k];
//                System.out.println("mathSum = " +totalMathSum);
            }
        }
        double totalMathAvg = (double) totalMathSum/totalStudent;
        System.out.println("수학 점수 총합 : "+totalMathSum);
        System.out.println("전체 학생의 수학 평균 점수 : "+totalMathAvg);
        System.out.println();

        int[][] englishScore = new int[2][];
        englishScore[0] = new int[2];
        englishScore[1] = new int[3];

        for(int i=0; i<englishScore.length; i++){
            for(int k = 0; k<englishScore[i].length; k++)
            {
                System.out.println(STR."engScores[\{i}][\{k}] = " + englishScore[i][k]);
            }
        }
        System.out.println();

        englishScore[0][0] = 90;
        englishScore[0][1] = 91;
        englishScore[1][0] = 92;
        englishScore[1][1] = 93;
        englishScore[1][2] = 94;

        totalStudent = 0;

        int totalEngSum = 0;

        for(int i =0; i < englishScore.length; i++){
            totalStudent += englishScore[i].length;
            for(int k=0; k < englishScore[i].length; k++){
                totalEngSum += englishScore[i][k];
            }
        }

//        for(int[] english : englishScore){
//            totalStudent += english.length;
//            for(int score : english)
//            {
//
//            }
//        }

        double totalEngAvg = (double)totalEngSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 : " + totalEngAvg);
    }
}
