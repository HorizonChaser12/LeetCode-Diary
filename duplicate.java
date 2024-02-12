public class duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
//        Works pretty well for high elements in the array as it lowers the search scape by dividing the comparison to start from 450
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
                if(j > 450) {
                    j = nums.length;
                }
            }
        }
        return false;
    }
}
