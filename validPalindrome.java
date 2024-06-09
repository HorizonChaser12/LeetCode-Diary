//https://leetcode.com/problems/valid-palindrome/

public class validPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
//        Pretty easy code but runs at 5 ms. Can be made better by using 2 pointers method.
//        ArrayList<Character> char1=new ArrayList<>();
//        ArrayList<Character> char2=new ArrayList<>();
//        s=s.toLowerCase();
//        for (int i = 0;i<s.length(); i++) {
//            if(Character.isLetterOrDigit(s.charAt(i))){
//                char1.add(s.charAt(i));
//            }
//        }
//        for (int i = char1.size()-1; i>=0; i--) {
//            char2.add(char1.get(i));
//        }
//        return char1.equals(char2);


//       2 Pointer Method
        s = s.toLowerCase();
        String[] str = s.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (String string : str) {
            sBuilder.append(string);
        }
        s = sBuilder.toString();
        int L = 0;
        int R = s.length() - 1;
        while (L < R) {
            if (s.charAt(L) == s.charAt(R)) {
                L++;
                R--;
            } else if (!Character.isLetterOrDigit(s.charAt(L))) {
                L++;
            } else if (!Character.isLetterOrDigit(s.charAt(R))) {
                R--;
            } else {
                return false;
            }
        }
        return true;
    }
}
