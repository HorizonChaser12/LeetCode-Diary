//https://leetcode.com/problems/extra-characters-in-a-string/description/
public class extraCharactersInString {
    public static void main(String[] args) {
        String[] dictionary = {"leet","code","leetcode"};
        String s = "leetscode";
        System.out.println(minExtraChar(s,dictionary));
    }
    static int minExtraChar(String s, String[] dictionary) {
//       With this code i passed 310 test cases.But I was wrong,there can be multiple letters as well as same dictionary word can be repeated in the string and thus the need of DP is required here.
        int extra = 0;
        int count;
        for (int i = 0; i < s.length(); i++) {
            count=0;
            for (int j = 0; j < dictionary.length; j++) {
                String word = dictionary[j];
                if (!word.contains(Character.toString(s.charAt(i)))){
                    count++;
                }
            }
            if (count==dictionary.length){
                extra++;
            }
        }
        return extra;
    }
}
