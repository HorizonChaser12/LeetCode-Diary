//https://leetcode.com/problems/subarray-sums-divisible-by-k/solutions/5283239/easy-approach-beats-100-subarrays-divisible-by-k/?envType=daily-question&envId=2024-06-09
public class subarraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }

    static int subarraysDivByK(int[] nums, int k) {
//        I couldn't find a way to solve it using the two pointers a.k.a fast and slow.The problem was I couldn't figure out how to use the prefix sum as well as find the elements also which are divisible by k.Some cases did pass well while some did not.So I better be working on that stuff.
//        This is one of the solution that I found is actually very simple and understandable.
        // Array to store the frequency of remainders
        int[] remainderList = new int[k];
        // Variable to store the cumulative sum
        int sum = 0;
        // Variable to count the number of subarrays divisible by k
        int count = 0;
        // Initialize remainderList[0] to 1 to handle subarrays directly divisible by k
        remainderList[0] = 1;

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Update the cumulative sum
            sum += nums[i];

            // Calculate the remainder of the cumulative sum divided by k
            int rem = sum % k;

            // If the remainder is negative, adjust it to be positive
            if (rem < 0) {
                rem += k;
            }

            // Add the frequency of the current remainder to the count
            count += remainderList[rem];

            // Increment the frequency of the current remainder in the remainderList
            remainderList[rem]++;
        }
        // Return the count of subarrays divisible by k
        return count;
    }
}
