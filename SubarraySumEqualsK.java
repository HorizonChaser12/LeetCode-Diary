import java.util.Arrays;
//https://leetcode.com/problems/subarray-sum-equals-k/description/
//https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103?leftPanelTabValue=PROBLEM
public class SubarraySumEqualsK {
    public static void main(String[] args) {
       int[] nums = {1,-1,0};
       int k = 0;
       System.out.println(subarraySum(nums,k));
    }
    static int subarraySum(int[] arr, int s) {
//        int L=0,R=0;
//        int count=0;
//        int sum=0;
//        while(R<arr.length){
//            sum+=arr[R];
//            if(sum==s){
//                count++;
//                R++;
//            }
//            else if(sum<s){
//                R++;
//            }
//            else if(sum>s){
//                sum-=arr[L];
//                L++;
//                sum-=arr[R];
//            }
//        }
//        return count;

//       Passes all test cases but runtime is 1099ms
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == s) {
                    count++;
                }
            }
        }
        return count;
    }
}
