//https://leetcode.com/problems/maximum-value-after-insertion/description/
class maximumValueAfterInsertion {
    public static void main(String[] args) {
        String n = "-99";
        int x = 2;
        System.out.println(maxValue(n, x));
    }

    static String maxValue(String str, int x) {
        StringBuilder s = new StringBuilder(str);
        String k = String.valueOf(x);
        int n = s.length();

        // Check if the number is positive
        if (str.charAt(0) != '-') {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) - '0' < x) {
                    s.insert(i, k);
                    return s.toString();
                }
            }
        }
        // If the number is negative
        else {
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) - '0' > x) {
                    s.insert(i, k);
                    return s.toString();
                }
            }
        }
        s.append(k);
        return s.toString();
    }
}
