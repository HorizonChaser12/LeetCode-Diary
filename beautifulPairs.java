//https://leetcode.com/problems/number-of-beautiful-pairs/
public class beautifulPairs {
    public static void main(String[] args) {
        int[] arr={1799,259,1453,374,1854,2212,2104,2221};
        System.out.println(countBeautifulPairs(arr));
    }
    public static int countBeautifulPairs(int[] nums) {
        int count = 0;
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                temp=nums[i];
                while (temp >= 10) {
                    temp /= 10;
                }
                if (findGCD(temp, nums[j]%10) == 1) {
               count++;
               }
            }
            }
        return count;
    }
    public static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}