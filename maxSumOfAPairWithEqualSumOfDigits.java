import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
//https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/?envType=daily-question&envId=2025-02-12
public class maxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] nums = {10,12,19,14};
        System.out.println(maximumSum(nums));
    }
    static int maximumSum(int[] nums) {
//        71 / 83 testcases passed
//        int max = Integer.MIN_VALUE;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(sumOfDigits(nums[i]));
//        }
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if (Objects.equals(list.get(i), list.get(j))){
//                    max = Math.max(nums[i]+nums[j],max);
//                }
//            }
//        }
//        return max==Integer.MIN_VALUE ? -1 : max;


//      A pretty much same answer but with a hint of using efficient grouping. Will also be attaching a list that solves the problem with no need of matrix.
//        https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/solutions/6410739/beats-100-efficient-grouping-approach-easiest-solution-ever-algorithm-explained/?envType=daily-question&envId=2025-02-12        int[][] maxNumbers = new int[82][2]; // Digit sums range from 0 to 81

//        Explanation
//        Digit Sum Calculation: The sumOfDigits function computes the sum of the digits of a number. This is done efficiently by repeatedly extracting the last digit and removing it until the number becomes zero.
//
//        Tracking Largest Numbers: We use a 2D array maxNumbers where each entry at index i stores the two largest numbers encountered with a digit sum of i. For each number, we update this array to ensure we always have the top two largest numbers for each digit sum.
//
//        Computing Maximum Sum: After processing all numbers, we iterate through each possible digit sum group. For groups that have at least two numbers, we compute the sum of the two largest numbers and update the maximum sum if this sum is larger than the current maximum.
        int[][] maxNumbers = new int[82][2]; // Digit sums range from 0 to 81
        for (int[] arr : maxNumbers) {
            Arrays.fill(arr, Integer.MIN_VALUE);
        }
        for (int num : nums) {
            int sum = sumOfDigits(num);
            if (num > maxNumbers[sum][0]) {
                maxNumbers[sum][1] = maxNumbers[sum][0];
                maxNumbers[sum][0] = num;
            } else if (num > maxNumbers[sum][1]) {
                maxNumbers[sum][1] = num;
            }
        }

        int maxSum = -1;
        for (int[] pair : maxNumbers) {
            if (pair[0] != Integer.MIN_VALUE && pair[1] != Integer.MIN_VALUE) {
                int currentSum = pair[0] + pair[1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }
    static int sumOfDigits(int n){
        int sum =0;
        while (n>0){
            int temp = n%10;
            n=n/10;
            sum+=temp;
        }
        return sum;
    }
}
