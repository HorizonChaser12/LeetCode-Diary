import java.util.Arrays;
//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/
public class lengthOfLongestSubarrayWithAtMostKFrequency {
    public static void main(String[] args) {
        int[] nums = {2,1,2,3};
        int k = 1;
        System.out.println(maxSubarrayLength(nums,k));
    }
    static int maxSubarrayLength(int[] nums, int k) {
//      passes 866 out of 992 test cases, The problem I am facing is memory limit exceeded because the value of the elements in the array can be almost equal to 10^9. So, I guess the need of hashmap is necessary here.
//      I look to optimize it more.
        int L=0;
        int R=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            max=Math.max(nums[i],max);
        }
        int count=0;
        int maxcount=0;
        int[] freq=new int[max+1];
        while(L<nums.length && R<nums.length){
            if(freq[nums[R]]<k){
                freq[nums[R]]++;
                R++;
                count++;
                maxcount=Math.max(count,maxcount);
            }
            else{
                count=0;
                Arrays.fill(freq,0);
                L++;
                R=L;
            }
        }
        return maxcount;


//        This is the only code that is not hashmap and works like charm, I will look into it.
//        // Find the minimum and maximum elements in the array
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int num : nums) {
//            min = Math.min(min, num);
//            max = Math.max(max, num);
//        }
//
//        // Create an array to store the frequencies of elements
//        int[] frequencies = new int[max - min + 1];
//
//        int left = 0; // Left pointer for the sliding window
//
//        int maxWindow = 0; // Variable to store the maximum length of the good subarray
//
//        // Iterate through the array using the right pointer
//        for (int right = 0; right < nums.length; right++) {
//            frequencies[nums[right] - min]++; // Increment the frequency of the current element
//
//            // Shrink the window until all frequencies are less than or equal to k
//            while (frequencies[nums[right] - min] > k) {
//                frequencies[nums[left] - min]--; // Decrement the frequency of the element at the left pointer
//
//                left++; // Move the left pointer to the right
//            }
//
//            // Update the maximum window size
//            maxWindow = Math.max(maxWindow, right - left + 1);
//        }
//
//        return maxWindow; // Return the maximum length of the good subarray
    }
}
