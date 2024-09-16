//https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/?envType=daily-question&envId=2024-09-14
public class longestSubarrayWithMaxBitwiseAnd {
    public static void main(String[] args) {
        int[] nums = {311155,311155,311155,311155,311155,311155,311155,311155,201191,311155};
        System.out.println(longestSubarray(nums));
    }
    static int longestSubarray(int[] nums) {
//       Although there isn't any use of bitwise and or anything.It is a backdoor of the question of where we have to just find the no. of occurrence of the largest element in a subarray.
//       but this isnt the correct solution to be honest.
//       seems like the solution isnt backdoor,its actually the solution.The question phrasing is so bad.
//        https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/solutions/5783565/nakab-posh-question-chalo-deduce-kre-observation-ko/?envType=daily-question&envId=2024-09-14
//        This guy explains it really well.
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                count++;
            }
            else if(count!=0 && nums[i]!=max){
                count=0;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}
