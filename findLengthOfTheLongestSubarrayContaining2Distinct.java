import java.util.HashSet;
//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1
public class findLengthOfTheLongestSubarrayContaining2Distinct {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 2, 2};
        System.out.println(totalElements(arr));
    }
    static int totalElements(int[] arr) {
        // code here
        int left = 0;
        int right = 0;
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int len = 0;
        while (left < arr.length) {
            while (right < arr.length) {
                set.add(arr[right]);
                if (set.size() > 2) {
                    set.remove(arr[left]);
                    break;
                }
                len = (right - left) + 1;
                max = Math.max(max, len);
                right++;
            }
            left++;
            right=left;
        }
        return max;
    }
}
