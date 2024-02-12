package InterviewQuestions;

import java.util.Arrays;

//rotate array to left
public class Q7 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,7};
        int d=2;
        rotatearray(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotatearray (int[] arr,int d){
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
