import java.util.Random;

//https://leetcode.com/problems/find-the-maximum-achievable-number/
public class maximumAchievableNumber {
    public static void main(String[] args) {
        int num=3;
        int t=2;
        System.out.println(theMaximumAchievableX(num,t));
    }
    public static int theMaximumAchievableX(int num, int t) {
        return num+(t*2);
    }
}
