import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,-1};
        System.out.println(longestConsecutive(nums));
    }
    static int longestConsecutive(int[] a) {
//        Does work for elements of the array smaller than the integer capacity but fails for long elements as the traversal of a long array increases the complexity
//        int count=0;
//        int[] arr= new int[1000000000];
//        for(int i=0;i<nums.length;i++){
//            arr[nums[i]+500]++;
//        }
//        int max=0;
//        for(int i=0;i<arr.length;i++){
//            count=0;
//            while(arr[i]!=0){
//                count++;
//                i++;
//            }
//            max=Math.max(max,count);
//        }
//        return max;

//        One of the most optimized code where we use hashset instead of an array which performs in O(1) and thus saves runtime.
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
