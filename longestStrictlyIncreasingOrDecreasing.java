//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
public class longestStrictlyIncreasingOrDecreasing {
    public static void main(String[] args) {
        int[] nums = {1,1,5};
        System.out.println(longestMonotonicSubarray(nums));
    }

    static int longestMonotonicSubarray(int[] nums) {
//        int decreasing = 0;
//        int increasing = 0;
//        int longestincreasing = 0;
//        int longestdecreasing = 0;
//        for (int i = 1; i < nums.length; i++) {
//            int curr = nums[i];
//            int prev = nums[i-1];
//            if (prev<curr){
//                increasing++;
//                decreasing=0;
//                longestincreasing=Math.max(increasing,longestincreasing);
//            }
//            else if(curr<prev){
//                decreasing++;
//                increasing=0;
//                longestdecreasing=Math.max(decreasing,longestdecreasing);
//            }
//            else{
//                increasing=0;
//                decreasing=0;
//            }
//        }
//        return 1+Math.max(longestdecreasing,longestincreasing);


        int incrMax =1;
        for(int i=0;i<nums.length-1;i++){
            int count1=0;
            if(nums[i]<nums[i+1]){
                int j =i;
                count1++;
                while(j<nums.length-1 && nums[j]<nums[j+1]){
                    count1++;
                    j++;
                }
                incrMax=Math.max(count1,incrMax);
            }
        }
        int decrMax=1;
        for(int i=0;i<nums.length-1;i++){
            int count2=0;
            if(nums[i]>nums[i+1]){
                int j =i;
                count2++;
                while(j<nums.length-1 && nums[j]>nums[j+1]){
                    count2++;
                    j++;
                }
                decrMax=Math.max(count2,decrMax);
            }
        }
        return Math.max(decrMax, incrMax);
    }
}
