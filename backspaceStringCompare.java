import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/backspace-string-compare/description/
public class backspaceStringCompare {
    public static void main(String[] args) {
        String s = "j##xfix", t = "j###xfix";
        System.out.println(backspaceCompare(s,t));
    }
    static boolean backspaceCompare(String s, String t) {
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        List<Character> list1= new ArrayList<>();
        List<Character> list2= new ArrayList<>();
        for (char value : char1) {
            list1.add(value);
        }
        for (char c : char2) {
            list2.add(c);
        }
        for(int i=0;i<list1.size();i++){
            if(i==0 && list1.get(i)=='#'){
                list1.remove(i);
                i=-1;
            }
            else if(list1.get(i)=='#'){
                list1.remove(i-1);
                list1.remove(i-1);
                i=-1;
            }
        }
        for(int i=0;i<list2.size();i++){
            if(i==0 && list2.get(i)=='#'){
                list2.remove(i);
                i=-1;
            }
            else if(list2.get(i)=='#'){
                list2.remove(i-1);
                list2.remove(i-1);
                i=-1;
            }
        }
        return list1.equals(list2);
    }
//    Faster and the best till now with the use of string builder,saves tons of space as well as runtime in the comparisons done by for loops.
//    public boolean backspaceCompare(String s, String t) {
//        return processString(s).equals(processString(t));
//    }
//    private static String processString(String str) {
//        StringBuilder result = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            if (c == '#') {
//                if (result.length() > 0) {
//                    result.deleteCharAt(result.length() - 1);
//                }
//            } else {
//                result.append(c);
//            }
//        }
//        return result.toString();
//    }
}
