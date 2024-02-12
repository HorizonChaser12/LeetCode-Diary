import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class squaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int start=0;
        int end= nums.length-1;
        int[] ans = new int[nums.length];
        int j= nums.length-1;
        while (start<=end){
            if(nums[start]*nums[start] > nums[end]*nums[end]){
                ans[j]=nums[start]*nums[start];
                start++;
            }
            else {
                ans[j]=nums[end]*nums[end];
                end--;
            }
            j--;
        }
        return ans;
    }
}
