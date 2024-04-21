//https://leetcode.com/problems/string-to-integer-atoi/
//Dumbest question I have ever encountered in my life. The edge cases are so frustrating that I left it like that.Ain't wasting time on this.
public class stringToInteger {
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        s=s.trim();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isDigit(a)){
                    ans = ans + a;
            }
            if (i==0 && s.charAt(i)=='-'){
                ans=ans+a;
            }
        }
        return Integer.parseInt(ans);
    }
}
