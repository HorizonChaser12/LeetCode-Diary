//https://leetcode.com/problems/find-pivot-index/
public class findPivotIndex {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int ele : nums){
            totalSum += ele;
        }
        int leftSum = 0;
        for(int i = 0; i<nums.length; i++){
            totalSum-=nums[i];
            if(totalSum == leftSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
