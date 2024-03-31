import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
public class firstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct] ){
                int temp=arr[correct];
                arr[correct]= arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
}
//