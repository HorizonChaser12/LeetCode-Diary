//https://leetcode.com/problems/single-number-ii/(runtime is above 72ms,have to optimize the code)
public class singleNumber_2 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
       return 0;
    }
}
