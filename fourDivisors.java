//https://leetcode.com/problems/four-divisors/description/?envType=daily-question&envId=2026-01-03
public class fourDivisors {
    public static void main(String[] args) {
        int[] nums = {21,4,7};
        System.out.println(sumFourDivisors(nums));
    }
    static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int loopsum = 0;
            for (int j = 1; j <= Math.sqrt(nums[i]); j++) {
                if (nums[i]%j==0){
                    count++;
                    loopsum+=j;
                    if (j!=nums[i] / j) {
                        loopsum += nums[i] / j;
                        count++;
                    }
                }
                if (count>4){
                    break;
                }
            }
            if (count==4){
            sum=sum+loopsum;
            }
        }
        return sum;
    }

}
