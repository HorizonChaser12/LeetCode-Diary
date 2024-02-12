//https://leetcode.com/problems/find-the-winner-of-an-array-game/description/
public class findTheWinnerOfArrayGame {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,7};
        int k = 2;
        System.out.println(getWinner(arr,k));
    }
    static int getWinner(int[] arr, int k) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else {
                count++;
            }
            if (count >= k) {
                return max;
            }
        }
        return max;
    }
}
