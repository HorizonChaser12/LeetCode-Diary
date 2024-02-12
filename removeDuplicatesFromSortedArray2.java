import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class removeDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int count=0;
        int ans=0;
        int unique=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==unique){
                count++;
            }
            else{
                count=1;
                unique=nums[i];
            }
            if(nums[i]==unique && count>2){
                nums[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if (num != Integer.MAX_VALUE) {
                ans++;
            }
        }
        return ans;
        //        A far better version of code using the same concept but avoiding the arrays.sort part.
//        if (nums.length == 0) {
//            return 0;
//        }
//        int ans = 1; // Initialize answer to 1, as the first element is always unique.
//        int count = 1; // Initialize count to 1 for the first element.
//        int unique = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == unique) {
//                if (count < 2) {
//                    nums[ans] = nums[i];
//                    ans++;
//                }
//                count++;
//            } else {
//                unique = nums[i];
//                nums[ans] = nums[i];
//                ans++;
//                count = 1;
//            }
//        }
//
//        return ans;
    }
}
