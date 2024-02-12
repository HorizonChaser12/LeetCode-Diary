//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
//Need to learn binary search and other things again!
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseVowelsOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
//        Two pointer method is more powerful as it runs in one run and swaps the position with the inplace algo.
//        int n= s.length();
//        char[] ch = s.toCharArray();
//        int start = 0;
//        int end = n-1;
//        while(start < end) {
//            if(!isVowel(ch[start])) {
//                start++;
//            }
//            else if(!isVowel(ch[end])) {
//                end--;
//            }else {
//                char t = ch[start];
//                ch[start] = ch[end];
//                ch[end] = t;
//                start++;
//                end--;
//            }
//        }
//        return new String(ch);
//    }
//    public static boolean isVowel(char temp) {
//        return temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U';
//    }
        char[] char1= s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }
        Collections.reverse(list);
        int j=0;
        for (int i = 0; i < char1.length; i++) {
            if (isVowel(char1[i])){
                char1[i]= list.get(j);
                j++;
            }
        }
        return String.valueOf(char1);
    }
    public static boolean isVowel(char temp) {
        return temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U';
    }
}
