//https://leetcode.com/problems/clear-digits/description/?envType=daily-question&envId=2025-02-10
public class clearDigits {
    public static void main(String[] args) {
        String s = "gbysb5";
        System.out.println(clearDigitss(s));
    }
    static String clearDigitss(String s) {
        int[] freq = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            if (Character.isDigit(s.charAt(i))){
                for (int j = i; j>=0 ; j--) {
                    if (Character.isAlphabetic(s.charAt(j)) && freq[j]==0){
                        freq[j]++;
                        flag=true;
                        break;
                    }
                }
                if (flag){
                    freq[i]++;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (freq[i]==0){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
