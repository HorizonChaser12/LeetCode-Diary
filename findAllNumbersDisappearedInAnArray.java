import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class findAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        // Brute force with O(n) but space complexity is not constant
        // int[] freq = new int[nums.length+1];
        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        // List<Integer> ans = new ArrayList<>();
        // for(int i = 1;i<freq.length;i++){
        //     if(freq[i]==0){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
