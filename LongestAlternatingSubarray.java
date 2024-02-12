//https://leetcode.com/problems/longest-alternating-subarray/
public class LongestAlternatingSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,3,4};
        System.out.println(alternatingSubarray(nums));
    }
    static int alternatingSubarray(int[] nums) {
        int slow=0;
        int fast=slow+1;
        int ans=0;
        int max=0;
        while(slow!=nums.length-1){
            if((fast<nums.length-1 && nums[fast]==nums[slow]+1) && nums[fast] - nums[slow] == -1 || nums[fast] - nums[slow] == 1){
                ans=fast-slow;
                if(ans>max){
                    max=ans;
                }
                fast++;
            }
            else if (nums[fast]!=nums[slow]+1){
                slow++;
                fast=slow+1;
            }
        }
        return ans>0 ? ans : -1;

//        Actually working solution. Pretty efficient and smooth.
//        int max=-2,n=nums.length,end=1,start=0,o=1,c=0;
//        while(end<n){
//            if(nums[end]-nums[start]==o){
//                c+=1;
//                max=Math.max(max,c);
//                end++;
//                start++;
//                o*=-1;
//            }
//            else{
//                if(o==-1){
//                    o=1;
//                }
//                else if(o==1){
//                    start++;
//                    end++;
//                }
//                c=0;
//            }
//        }
//        return max+1;
    }
}
