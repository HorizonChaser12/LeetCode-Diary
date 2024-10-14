import java.util.Arrays;
//https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/description/
public class dividePlayersIntoTeamsEqualSkill {
    public static void main(String[] args) {
        int[] skill = {3,4};
        System.out.println(dividePlayers(skill));
    }
    static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length-1;
        int target = skill[left]+skill[right];
        int ans = 0;
        while(left<right){
            if (skill[left]+skill[right]==target){
                ans += skill[left]*skill[right];
            }
            else{
                return -1;
            }
            left++;
            right--;
        }
        return ans;
    }
}
