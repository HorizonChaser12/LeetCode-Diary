//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] arr= {12,1,12};
        int extra=10;
        List<Boolean> ans=kidsWithCandies(arr,extra);
        System.out.println(ans);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> ans=new ArrayList<>();
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            int actual = candy + extraCandies;
            if (actual >= max) {
                ans.add(Boolean.TRUE);
            } else {
                ans.add(Boolean.FALSE);
            }
        }
        return ans;
    }
}
