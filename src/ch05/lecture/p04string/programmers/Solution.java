package ch05.lecture.p04string.programmers;

public class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int prev = Integer.parseInt(str[0]);

        for(int i=1; i < str.length; i +=2){
            String operator = str[i];

            switch (operator){
                case "+"->{
                    prev = prev + Integer.parseInt(str[i+1]);
                }
                case "-" ->{
                    prev = prev - Integer.parseInt(str[i+1]);
                }
            }
        }
        int answer = prev;
        return answer;
    }
}
