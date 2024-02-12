//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
public class elementSumSubDigitSum {
    public static void main(String[] args) {
        int[] newnums = {12, 97, 48, 72, 31, 70, 1, 9, 78, 28, 1, 30, 82, 17, 43, 44, 53, 12, 73, 16, 74, 24, 79, 9, 51, 77, 36, 38, 81, 38, 69, 60, 29, 21, 66, 6, 62, 55, 13, 90, 66, 7, 15, 15, 60, 76, 44, 30, 6, 86, 87, 59, 88, 36, 32, 35, 67, 13, 79, 43, 27, 2, 97, 41, 4, 44, 91, 11, 5, 48, 38, 64, 9, 90, 39, 28, 50, 57, 60, 4, 99, 44, 39, 12, 95, 32, 66, 100, 45, 42, 22, 35, 65, 7, 49, 43, 41, 40, 64, 78};
        System.out.println(differenceOfSum(newnums));
        System.out.println(124 / 100 + +124 % 10);

    }

    public static int differenceOfSum(int[] nums) {
        int Esum = 0;
        int Dsum = 0;
        for (int i = 0; i < nums.length; i++) {
            Esum += nums[i];
            Dsum += digitSum(nums[i]);
        }
        int difference = Esum - Dsum;
        return Math.abs(difference);
    }

    static int digitSum(int number) {
        int temp=0;
        while (number > 0) {
            int remainder = number % 10;
            temp=remainder+temp;
            number = number / 10;
        }
        return temp;
    }
}
