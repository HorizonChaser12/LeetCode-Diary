package InterviewQuestions;
//Calculate the sum of the array using recursion.

public class Q6 {
    public static void main(String[] args) {
        int[] arr= {1,6,3,8,2};
        System.out.println(sumRecursion(arr,arr.length-1));
    }
    static int sumRecursion(int[] arr,int N){
        if (N<0){
            return 0;
        }
        return arr[N]+sumRecursion(arr,N-1);
    }

}
