import java.util.Arrays;

public class primeSubtractionOperation {
    public static void main(String[] args) {
        int[] nums = {6,8,11,12};
        System.out.println(primeSubOperation(nums));
    }
    static boolean primeSubOperation(int[] nums) {
        if (checkCondition(nums)) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]-1; j > 0; j--) {
                if (i< nums.length-2 && isPrime(j) && nums[i+1]>nums[i]-j){
                    nums[i]=nums[i]-j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return checkCondition(nums);
    }
    private static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkCondition(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                cnt++;
            }
        }
        return cnt == 0;
    }
}
