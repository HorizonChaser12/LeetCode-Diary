import java.util.Arrays;
//https://leetcode.com/problems/candy/description/
public class candy {
    public static void main(String[] args) {
        int[] ratings = {1,2,87,87,87,2,1};
        System.out.println(candys(ratings));
    }

    static int candys(int[] ratings) {
        int[] ans = new int[ratings.length];
        Arrays.fill(ans, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                ans[i] = ans[i - 1] + 1;
            }

        }
        for (int i = ratings.length-2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1]) {
                ans[i] = Math.max(ans[i], ans[i + 1] + 1);
            }

        }
        System.out.println(Arrays.toString(ans));
        int candies = 0;
        for (int i = 0; i < ans.length; i++) {
            candies += ans[i];
        }
        return candies;
    }
}
