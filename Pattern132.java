public class Pattern132 {
    public static void main(String[] args) {
        int[]  nums = {1,0,1,-4,-3};
        System.out.println(find132pattern(nums));
    }
//    Implementation of stacks is there.Need to learn more!
    static boolean find132pattern(int[] nums) {
        if(nums.length<2){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-2 && nums[i]<nums[i+1]){
                if(nums[i+1]>nums[i+2]){
                    return true;
                }
            }
        }
        return false;
    }
}
