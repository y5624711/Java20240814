package ch05.lecture.sec05;

public class test {
    public static void main(String[] args) {

    }
//잘라서 문자열 배열 저장
//"abc1Addfggg4556b"	6개씩	["abc1Ad", "dfggg4", "556b"]
//"abcdef123"	3개씩	["abc", "def", "123"]

    public String[] solution(String my_str, int n){

     int l = my_str.length()/n;

     if(my_str.length() % n != 0){
         l++;
     }

     String[] answer = new String[l];

     int answerIndex = 0;
     int begin = 0;
     int end = n;

     while(begin < my_str.length()){
         if(end > my_str.length())
         {
             end = my_str.length();
         }
         answer[answerIndex] = my_str.substring(begin,end);
         answerIndex ++;
         begin += n;
         end += n;
     }
//
//     answer[1] = my_str.substring(n, n+n);
//     answer[2] = my_str.substring(n+n, n+n+n);
//     answer[3] = my_str.substring(n+n+n, n+n+n+n);

        return answer;
    }
}
