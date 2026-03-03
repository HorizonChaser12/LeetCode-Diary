import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
public class firstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] arr) {
        // int i=0;
        // while(i<arr.length){
        //     int correct=arr[i]-1;
        //     if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct] ){
        //         int temp=arr[correct];
        //         arr[correct]= arr[i];
        //         arr[i]=temp;
        //     }
        //     else {
        //         i++;
        //     }
        // }
        // for (int index=0;index<arr.length;index++){
        //     if (arr[index]!=index+1){
        //         return index+1;
        //     }
        // }
        // return arr.length+1;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if (arr[i]<0 || arr[i]>arr.length) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length+1; i++) {
            int num = Math.abs(arr[i-1]); 
            if (num > 0 && num <= arr.length) {
                int index = num - 1;
                arr[index] = -Math.abs(arr[index]); 
            }
            if (arr[i-1]==0) {
                arr[i-1] = -i;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                return i+1;
            }
        }
        return n+1;
    }
}
//