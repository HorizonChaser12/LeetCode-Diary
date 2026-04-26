import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/summary-ranges/description/
public class summaryChanges {
    static void main() {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
    static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int slow = 0;
        int fast = 0;
        while(slow<nums.length){
            if(fast<nums.length-1 && nums[fast]+1==nums[fast+1]){
                fast++;
            }
            else if(slow == fast){
                String str = String.valueOf(nums[slow]);
                ans.add(str);
                slow = fast+1;
                fast = slow;
            }
            else{
                String str = nums[slow]+"->"+nums[fast];
                ans.add(str);
                slow = fast+1;
                fast = slow;
            }
        }
        return ans;
    }
}
