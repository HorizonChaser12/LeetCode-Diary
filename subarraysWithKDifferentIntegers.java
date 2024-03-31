import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/problems/subarrays-with-k-different-integers/description/?envType=daily-question&envId=2024-03-30
public class subarraysWithKDifferentIntegers {
    public static void main(String[] args) {
        int[] nums = {2,1,2,1,2};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums,k));
    }
    static int subarraysWithKDistinct(int[] nums, int k) {
//      Okay, so this solution works thou but is not actually an integral way of how sliding window works, and thus it fails for higher length of the array due to being O(n^2).
//      So my next step will be to work on my logic of how to not destroy the resizing of the window. The answer goes wrong when i re-initiate the value of R to L. So,gotta look over that.
//        int count=0,counter=0;
//        int L=0;
//        int R=0;
//        HashSet<Integer> set = new HashSet<>();
//        while(R<nums.length) {
//            while (R < nums.length) {
//                if (!set.contains(nums[R])) {
//                    set.add(nums[R]);
//                    counter++;
//                }
//                if (set.size() > k) {
//                    L++;
//                    R = L;
//                    counter--;
//                    set.remove(nums[L]);
//                    continue;
//                }
//                if (k == counter) {
//                    count++;
//                }
//                R++;
//            }
//            L++;
//            R=L;
//            counter=0;
//            set.clear();
//        }
//        return count;



        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

//  This is by far the most sane answer with sliding windows as well as without using hashmap or anything, and ngl this is quite am impressive code.
//    https://leetcode.com/problems/subarrays-with-k-different-integers/solutions/4944679/easy-code-fully-explained-best-approach/?envType=daily-question&envId=2024-03-30
//    This is the answer and if you ever come back to this question, do look the stepwise solution and learn the way he approaches to this question.
    static int atMostKDistinct(int[] nums, int k) {
        int[] count = new int[nums.length + 1];
        int left = 0, distinct = 0, result = 0;

        for (int right = 0; right < nums.length; right++) {
            if (count[nums[right]] == 0) {
                distinct++;
            }
            count[nums[right]]++;

            while (distinct > k) {
                count[nums[left]]--;
                if (count[nums[left]] == 0) {
                    distinct--;
                }
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }
}
