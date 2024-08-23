package ch05.lecture.sec09;

public class ArrayCopyForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};

        int[] newInArray  = new int[5];

        for(int i= 0; i < oldIntArray.length; i++){
            newInArray[i] = oldIntArray[i];
            System.out.println(newInArray[i] + ", "+oldIntArray[i]);
        }

        for(int i =0; i < newInArray.length; i++){
            System.out.print(newInArray[i] + ", ");
        }
    }
}
