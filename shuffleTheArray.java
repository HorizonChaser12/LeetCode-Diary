import java.awt.event.ItemEvent;

//https://leetcode.com/problems/shuffle-the-array/
public class shuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int t = 4;
        int[] ans = shuffle(arr, t);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[nums.length];
        int i = 0;
        int j = 0;
        int k=1;
        int temp=n;
        while (i != temp ) {
            arr1[i] = nums[j];
            i = i + 2;
            j++;
            temp++;
        }
        while (k!=n+1){
            arr1[k] = nums[n];
            k=k+2;
            j++;
            n++;
        }

        return arr1;
    }
}
