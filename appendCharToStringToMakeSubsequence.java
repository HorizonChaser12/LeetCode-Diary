//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/?envType=daily-question&envId=2024-06-03
public class appendCharToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "dj";
        String t= "xnb";
        System.out.println(appendCharacters(s,t));
    }
    static int appendCharacters(String s, String t) {
//       Does the work but higher time complexity.
//        int a = t.length();
//        int b = 0;
//        int start = 0 ;
//        int start2 = 0;
//        while (b<s.length()){
//            while (start2<t.length()){
//                if (start2<s.length() && t.charAt(start)==s.charAt(start2)){
//                    a--;
//                    start++;
//                }
//                start2++;
//                if (start2==t.length()-1 && a==0){
//                    return t.length();
//                }
//            }
//            b++;
//            start2=0;
//        }
//        return a;


//      A better and faster solution that works well for all test cases and will be O(min(s.length,t.length))
        int start = 0;
        int start2 = 0;
        while (start2<t.length() && start<s.length()){
            if (s.charAt(start)==t.charAt(start2)){
                start2++;
            }
            start++;
        }
        return t.length()-start2;
    }
}
