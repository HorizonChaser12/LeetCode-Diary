import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-balanced-subarray-i/description/?envType=daily-question&envId=2026-02-10
public class longestBalancedSubarray1 {
    public static void main(String[] args) {
        int[] nums = {13,1,12};
        System.out.println(longestBalanced(nums));
    }
    static int longestBalanced(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while(left<nums.length){
            if(nums[right]%2==0 && !set1.contains(nums[right])){
                set1.add(nums[right]);
            }
            else if(nums[right]%2!=0){
                set2.add(nums[right]);
            }
            if(set2.size()==set1.size()){
                max = Math.max(right-left +1 ,max);
            }
            right++;
            if (right>nums.length-1){
                left++;
                right = left;
                set1.clear();
                set2.clear();
            }
        }
        return max;
    }
}
