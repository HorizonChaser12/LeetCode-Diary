import java.util.Arrays;

//https://leetcode.com/problems/divide-array-into-equal-pairs/
public class divideArrayInEqual {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(divideArray(nums));
    }
    static boolean divideArray(int[] nums) {
        if (nums.length%2!=0){
            return false;
        }
        Arrays.sort(nums);
        int count;
        for (int i = 0; i < nums.length-1; i++) {
            count=1;
            while (i<nums.length-1 && nums[i]==nums[i+1] ){
                count++;
                i++;
            }
            if(count%2==0){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
