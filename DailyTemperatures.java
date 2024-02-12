import java.util.Arrays;
//https://leetcode.com/problems/daily-temperatures/?envType=daily-question&envId=2024-01-31
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] nums = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(nums)));
    }

//    works for 47/48 test cases but fails for the last one as TLE. Use of stack is necessary to solve the lst test case.
    static int[] dailyTemperatures(int[] nums) {
//        int k;
//        int[] ans=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            k=i+1;
//            ans[i]=0;
//            while (k!=nums.length ){
//                if (nums[k]>nums[i]){
//                    ans[i]=k-i;
//                    break;
//                }
//                k++;
//            }
//        }
//        return ans;

//      Passes all test cases.
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int k = i + 1;
            while (k < n && nums[k] <= nums[i]) {
                if (ans[k] > 0) {
                    k += ans[k];
                } else {
                    k = n;
                }
            }
            if (k < n) {
                ans[i] = k - i;
            }
        }

        return ans;
    }
}
