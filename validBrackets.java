import java.util.HashSet;

//https://leetcode.com/problems/valid-parentheses/description/
//Checking required(got solutions in hashmap and using stacks).work on how to use arrays to do it.
public class validBrackets {
    public static void main(String[] args) {
        String sar = "([)]";
        System.out.println(isValid(sar));
    }
    public static boolean isValid(String s) {
        char[] char1=s.toCharArray();
        if (char1.length==1){
            return false;
        }
        HashSet <Character> set= new HashSet<>();
        for (int i = 0; i < char1.length; i++) {
            set.add(char1[i]);
        }
        System.out.println(set);
        return false;
    }
}
