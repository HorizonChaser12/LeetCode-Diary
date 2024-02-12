import java.util.Arrays;
//https://leetcode.com/problems/distribute-candies-to-people/description/
public class distributeCandiesToPeople {
    public static void main(String[] args) {
        int candies =  60;
        int num_people = 4;
        System.out.println(Arrays.toString(distributeCandies(candies,num_people)));
    }
    static int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i=0;
        int j=1;
        while (candies>0){
            if (candies<j){
                ans[i]=ans[i]+candies;
            }
            else {
                ans[i]= ans[i]+j;
            }
            candies = candies - j;
            j++;
            i++;
            if (candies!=0 && i== ans.length){
                i=0;
            }
        }
        return ans;
    }
}
