import java.util.HashSet;
//https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
public class findTheLengthOfLongestCommonPrefix {
    public static void main(String[] args) {
        int[] arr1 = {10};
        int[] arr2 = {17, 11};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }

    static int longestCommonPrefix(int[] arr1, int[] arr2) {
//      Actually did something with the code but the issue I faced was about the last element also getting included inside the hashset and while comparing it with the values of arr2 with the hashset, I couldn't figure out how to start from the very beginning of the number and this could only pass 300 test cases.
        HashSet<Integer> set = new HashSet<>();
        int maxPrefixLength = 0;

        // Step 1: Store all prefixes of arr1 in the HashSet
        for (int num : arr1) {
            while (num > 0) {
                set.add(num);  // Add the current prefix to the set
                num /= 10;     // Strip one digit from the end
            }
        }

        // Step 2: Check prefixes of arr2 in the HashSet and find the longest match
        for (int num : arr2) {
            int prefixLength = 0;
            int originalNum = num;

            while (num > 0) {
                if (set.contains(num)) {
                    // If the current prefix of num exists in arr1, update maxPrefixLength
                    maxPrefixLength = Math.max(maxPrefixLength, Integer.toString(num).length());
                    break;  // Since we found the longest prefix for this number, stop further checking
                }
                num /= 10;  // Strip one digit from the end
            }
        }
        return maxPrefixLength;
    }
}
