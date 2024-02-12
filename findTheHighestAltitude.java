//https://leetcode.com/problems/find-the-highest-altitude/description/
public class findTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain= {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for (int j : gain) {
            sum = sum + j;
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
