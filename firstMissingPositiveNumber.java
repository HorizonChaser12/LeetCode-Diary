import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
public class firstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
//        boolean[] arr=new boolean[nums.length+2];
//        for(int i : nums){
//            if(i>0 && i<=nums.length){
//                arr[i]=true;
//            }
//        }
//        for(int i=1;i<arr.length;i++){
//            if(!arr[i]){
//                return i;
//            }
//        }
//        return 0;

        int[] freq = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==0){
                return i;
            }
        }
        return -1;
    }
}
//        int i=0;
//        while(i<arr.length){
//            int correct=arr[i]-1;
//            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct] ){
//                int temp=arr[correct];
//                arr[correct]= arr[i];
//                arr[i]=temp;
//            }
//            else {
//                i++;
//            }
//        }
//        for (int index=0;index<arr.length;index++){
//            if (arr[index]!=index+1){
//                return index+1;
//            }
//        }
//        return arr.length+1;