//https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/
public class maxSumWithExactlyKEle {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(maximizeSum(nums,k));
    }
    static int maximizeSum(int[] nums, int k) {
        int max=0;
        int n=0;
        while(n!=nums.length){
            max=Math.max(nums[n],max);
            n++;
        }
        int ans=0;
        for(int i=1;i<=k;i++){
            ans=max+ans;
            max++;
        }
        return ans;
    }
}
