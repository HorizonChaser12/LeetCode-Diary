
public class constructMinBitwiseArray1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }
    static boolean hasAlternatingBits(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append(String.valueOf(n % 2));
            n = n / 2;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
