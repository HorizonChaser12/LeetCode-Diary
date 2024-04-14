public class minRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        String s = "(a(b(c)d)";
        System.out.println(minRemoveToMakeValid(s));
    }

    static String minRemoveToMakeValid(String s) {
        int i = 0;
        StringBuilder ans = new StringBuilder(s);
        boolean start = false;
        int count = 0;
        if (ans.charAt(i) == ')') {
            return "";
        }
        while (i < ans.length()) {
            if (ans.charAt(i) == '(') {
                count++;
                start = true;
            } else if (ans.charAt(i) == ')' && !start) {
                ans.delete(i, i + 1);
            }
            if (start && ans.charAt(i) == ')') {
                count--;
            }
            if (count == 0 || count % 2 != 0) {
                start = false;
            }
            i++;
        }
        return ans.toString();
    }
}
