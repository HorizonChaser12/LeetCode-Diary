import java.util.Arrays;
//https://leetcode.com/problems/the-k-strongest-values-in-an-array/description/
public class theKthStrongestValuesInAnArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 11, 7, 6, 8};
        int k = 5;
        System.out.println(Arrays.toString(getStrongest(arr, k)));
    }

    static int[] getStrongest(int[] arr, int k) {
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];
        int fast = arr.length - 1;
        int slow = 0;
        int i = 0;
        while (slow <= fast) {
            int first = Math.abs(arr[slow] - median);
            int second = Math.abs(arr[fast] - median);
            if (first > second) {
                ans[i] = arr[slow];
                slow++;
            } else {
                ans[i] = arr[fast];
                fast--;
            }
            i++;
        }
        int[] temp = new int[k];
        System.arraycopy(ans, 0, temp, 0, temp.length);
        return temp;
    }
}
