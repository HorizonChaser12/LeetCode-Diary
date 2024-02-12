//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
public class countNoOfPairsWithDiffK {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println(countKDifference(nums,k));
    }
    static int countKDifference(int[] nums, int k) {
        int count=0;
        int i=0;
        while(i!=nums.length){
            for (int num : nums) {
                if (nums[i] - num == k) {
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
