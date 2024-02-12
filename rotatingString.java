//https://leetcode.com/problems/rotate-string/
public class rotatingString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="abced";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // If lengths are different, goal is not a valid rotation of s
        }
        String result=s;
        for (int i = 0; i < s.length(); i++) {
                result = result.substring(1) + result.charAt(0);
                if(result.equals(goal)){
                    return true;
                }

        }
        return false;
    }
}

//more advanced approach
//if (s.length()!=goal.length())
//        return false;
//        return (goal+goal).contains(s);
