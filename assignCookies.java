import java.util.Arrays;
//https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01
public class assignCookies {
    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s ={1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int i=0;
        int count=0;
        while(i<g.length && j<s.length){
            if (s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
