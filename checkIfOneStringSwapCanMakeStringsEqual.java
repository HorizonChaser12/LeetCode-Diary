//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05
public class checkIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        String s1= "bank",s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)){
            return true;
        }
        if (s1.length()!=s2.length()){
            return false;
        }
        int count=0;
        char char1= ' ';
        char char2= ' ';
        int ans=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                count++;
                if (char1==' '){
                    char1=s1.charAt(i);
                }
                if (char2==' ') {
                    char2=s2.charAt(i);
                }
                if (char1==s2.charAt(i)){
                  ans++;
                }
                if (char2==s1.charAt(i)){
                    ans++;
                }
            }
            if (count>2){
                return false;
            }
        }
        return ans==2;
    }
}
