package InterviewQuestions;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort012(int[] nums) {
        int temp = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = nums[r];
                nums[r] = nums[i];
                nums[i] = temp;
                r++;
            }
        }
        int t = r;
        for (int i = r; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            }
        }
    }
}
