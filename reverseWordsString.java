//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class reverseWordsString {
    public static void main(String[] args) {
        String input="a good   example";
        System.out.println(reverseWords(input));
    }
    public static String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String[] str= s.split(" ");
        int j=str.length-1;
        String[] ans=new String[str.length];
        for (int i = 0; i < str.length; i++) {
            ans[i]=str[j];
                j--;
        }
        return String.join(" ",ans);
    }
}
