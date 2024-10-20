//https://leetcode.com/problems/separate-black-and-white-balls/?envType=daily-question&envId=2024-10-15
public class separateBlackAndWhiteBalls {
    public static void main(String[] args) {
        String s = "11000111";
        System.out.println(minimumSteps(s));
    }

    static long minimumSteps(String s) {
//        I couldnt actually find a good logic for this code and at last asked chatgpt regarding the issues inmy code:

//        Unnecessary Use of index Variable:
//        The index variable is intended to track the rightmost position where a '1' can be placed, but the way you decrement it in the initial loop can be confusing.
//        You decrement index for each '1' encountered, which means it doesn't accurately represent the right boundary of the grouped '1's during each iteration.
//
//        Looping with slow and fast:
//        The use of slow and fast pointers seems to aim for a two-pointer approach, but the logic is unclear and leads to unnecessary complexity.
//        Specifically, incrementing fast only when adjacent characters are the same doesn’t directly help in minimizing swaps.

//        Index Boundaries Mismanagement:
//        The condition while(fast<index+1 && fast<char1.length-1) in the inner loop might cause issues because it could skip over positions where a '1' needs to be swapped.
//        Also, since index is decremented in the outer loop, it could prematurely cause the loop to exit before all possible swaps are made.
//
//        Swapping Logic:
//        Swapping is correctly done when a '1' is encountered followed by a '0', but the overall structure makes it hard to follow and prone to missing swaps.
//                It might make more sense to simplify the swap counting by focusing on counting misplaced '1's relative to their target position, rather than doing the swaps directly.


//      Actual correct implementation of sliding window for this problem.
        int swaps = 0;
        int li = 0;
        int ri = s.length() - 1;
        while (li < ri) {
            if (s.charAt(li) == '1') {
                if (s.charAt(ri) == '0') {
                    swaps += ri - li;
                    li++;
                }
                ri--;
            } else {
                if (s.charAt(ri) == '1') ri--;
                li++;
            }
        }
        return swaps;




//        long ans = 0;
//        int countOnes = 0; // Count of '1's seen so far
//
//        for (char c : s.toCharArray()) {
//            if (c == '1') {
//                countOnes++;
//            } else {
//                // For every '0', add the count of '1's seen so far
//                ans += countOnes;
//            }
//        }
//
//        return ans;
//        Explanation of the Simplified Code:
//        countOnes keeps track of the number of '1's encountered as you iterate over the string.
//        For every '0' encountered, add countOnes to ans because each '1' seen so far needs to move past this '0' to reach its grouped position on the right.
//        This approach directly calculates the number of swaps needed without actually performing the swaps, resulting in better readability and efficiency.
    }
}
