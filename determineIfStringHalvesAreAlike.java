//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/?envType=daily-question&envId=2024-01-12

public class determineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        int count=0;
        for (int i = 0; i < s.length()/2; i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        for (int i =  s.length()/2; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                count--;
            }
        }
        if (count==0){
            return true;
        }
        return false;
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' ||  ch == 'U')
            return true;
        else
            return false;
    }
}
