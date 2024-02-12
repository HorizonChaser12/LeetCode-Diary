//https://leetcode.com/problems/find-the-middle-index-in-array/description/
//Watch its discussion as it needs some tinkling and needs to look over for other methods to solve this problem.
public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = {2,5};
        System.out.println(findMiddleIndex(nums));
    }
    static int findMiddleIndex(int[] nums) {
        int totalsum=0;
        for (int i = 0; i < nums.length; i++) {
            totalsum+=nums[i];
        }
        int leftsum=0;
        for (int i = 0; i < nums.length; i++) {
            if(leftsum==(totalsum-leftsum-nums[i])){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;

    }
}
