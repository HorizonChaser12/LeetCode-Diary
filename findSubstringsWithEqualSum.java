//https://leetcode.com/problems/find-subarrays-with-equal-sum/description/
public class findSubstringsWithEqualSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(findSubarrays(nums));
    }
    static boolean findSubarrays(int[] nums) {
        if (nums.length-1<=1){
            return false;
        }
        int sum1;
        int sum2;
        for(int i=0;i<nums.length-1;i++){
            sum1=nums[i]+nums[i+1];
            for(int j=i+1;j<nums.length-1;j++){
                sum2=nums[j]+nums[j+1];
                if(sum1==sum2){
                    return true;
                }
            }
        }
        return false;
//        Better Complexity
//        HashSet<Integer> set=new HashSet<Integer>();
//        for(int i=0;i<nums.length-1;i++){
//            int sum=nums[i]+nums[i+1];
//            if(set.contains(sum)){
//                return true;
//            }
//            else{
//                set.add(sum);
//            }
//        }
//        return false;
    }
}
