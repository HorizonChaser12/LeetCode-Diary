import java.util.Arrays;
//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
public class OriginalArrofPrefixXOR {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(pref)));
    }
    static int[] findArray(int[] pref) {
        int[] ans=new int[pref.length];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            ans[i]=pref[i] ^ pref[i-1];
        }
        return ans;
    }
}
