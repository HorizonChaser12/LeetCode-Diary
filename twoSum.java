import java.util.Arrays;
//https://leetcode.com/problems/two-sum/description/
public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSums(nums,target)));
    }
    static int[] twoSums(int[] nums, int target) {
//        2 pointers but O(n^2)
//        int left = 0;
//        int right = 1;
//        while(left<nums.length){
//            if(nums[left]+nums[right]==target){
//                return new int[]{left,right};
//            }
//            right++;
//            if (right== nums.length){
//                left++;
//                right=left+1;
//            }
//        }
//        return new int[]{-1,-1};
        int[] temp = new  int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[i];
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int ans1 = 0;
        int ans2 = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                ans1 = nums[left];
                ans2 = nums[right];
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < temp.length; i++) {
            if (ans1==temp[i] &&  index1==-1){
                index1=i;
            }
            else if (ans2==temp[i] && index2==-1){
                index2=i;
            }
        }
        return new int[]{index1, index2};
    }
}
