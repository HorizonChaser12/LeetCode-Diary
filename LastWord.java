//https://leetcode.com/problems/length-of-last-word/
public class LastWord {
    public static void main(String[] args){
        String s="a ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int ans=0;
//        if (s.length()==1){
//            return 1;
//        }
        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i)==' ' && ans==0){
                continue;
            }
            else if( s.charAt(i)!=' ') {
                ans++;
            }
            else {
                break;
            }
        }
        return ans;
    }
}
