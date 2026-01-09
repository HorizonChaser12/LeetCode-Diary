//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/?envType=daily-question&envId=2025-03-08
public class minimumRecolorsToGetKBlackBlocks {
    public static void main(String[] args) {
        String blocks = "BWWWBB";
        int k = 6;
        System.out.println(minimumRecolors(blocks,k));
    }
    static int minimumRecolors(String blocks, int k) {
//       4ms runtime and quite slow due to 2 loops and works on O(n*k) time complexity.
//        int fast=k;
//        int slow=0;
//        int steps = Integer.MAX_VALUE;
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < k; i++) {
//            ans.append("B");
//        }
//        if (blocks.contains(ans.toString())){
//            return 0;
//        }
//        while(slow<blocks.length() || fast<blocks.length()){
//            int count = 0;
//            int index = slow;
//            while ( index<fast && fast <= blocks.length()){
//                if (blocks.charAt(index)=='W'){
//                    count++;
//                }
//                index++;
//            }
//            if (count!=0){
//                steps = Math.min(steps, count);
//            }
//            slow++;
//            fast++;
//        }
//        return steps;

//      Better code and very efficient and works in 0ms and beats 100% accuracy.
        int n = blocks.length();
        int countW = 0;

        // Initial count of 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
        }

        int minSteps = countW;  // Start with the first window's count

        // Sliding the window across the string
        for (int i = k; i < n; i++) {
            // Remove the outgoing element
            if (blocks.charAt(i - k) == 'W') {
                countW--;
            }
            // Add the incoming element
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
            minSteps = Math.min(minSteps, countW);
        }

        return minSteps;
    }
}
