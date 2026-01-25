//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/?envType=problem-list-v2&envId=array

public class largestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
    static int dominantIndex(int[] nums) {
        int largest = 0;
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = Math.max(largest,nums[i]);
                ans = i;
            }

        }
        int secondlargest = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=largest){
                secondlargest = Math.max(secondlargest, nums[i]);

            }
        }
        if(secondlargest * 2 <= largest){
            return ans;
        }
        return -1;
    }
}
