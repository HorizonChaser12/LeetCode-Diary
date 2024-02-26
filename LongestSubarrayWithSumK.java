//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?leftPanelTabValue=PROBLEM
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,1,-1,-1,0};
        int k=0;
        System.out.println(getLongestSubarray(nums,k));
    }
    static int getLongestSubarray(int []nums, int k) {
        // Write your code here.
        int max=0;
        int L=0;
        int R=0;
        int sum=0;
//       Time complexity is O(n^2) that's why fails the last test case.
        while(R<nums.length){
            while(R<nums.length){
                sum=sum+nums[R];
                if(sum==k){
                    if((R-L+1)>max){
                        max=R-L+1;
                    }
                }
                R++;
            }
            sum=0;
            L++;
            R=L;
        }
        return max;
    }
}
