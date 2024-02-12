//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(longestOnes(nums,k));
    }
    static int longestOnes(int[] nums, int k) {
        int L=0,R=0,n=nums.length,max=Integer.MIN_VALUE,counter=0,len;
        while(R<n){
            if (nums[R]==0){
                counter++;
            }
            while (k<counter){
                if (nums[L]==0){
                    counter--;
                }
                L++;
            }
            len=R-L+1;
            max=Math.max(len,max);
            R++;
        }
        return max == Integer.MIN_VALUE ? 0: max;
    }
}
