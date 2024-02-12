import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/contest/biweekly-contest-121/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public static void main(String[] args) {
        int[] nums ={38};
        System.out.println(missingInteger(nums));
    }
    static int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                max=max+nums[i];
            }
            else {
                break;
            }
        }
        for (int i = 0; i < set.size(); i++) {
            if(set.contains(max)){
                max++;
            }
            else {
                break;
            }
        }
        return max;
    }
}
