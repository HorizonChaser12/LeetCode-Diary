import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
public class pairWithDifference {
    public static void main(String[] args) {
        int[] arr = {1, 10, 1, 1, 7, 2};
        int x = 8;
        System.out.println(findPair(arr, x));
    }

    static boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = 1;
        while (start < end) {
//            int middle = start + (end - start) / 2;
            int diff = Math.abs(arr[start] - arr[end]);
            if (diff == x) {
                return true;
            }
            if (diff > x) {
                start++;
            } else {
                end++;
            }
        }
        return false;
    }
}
