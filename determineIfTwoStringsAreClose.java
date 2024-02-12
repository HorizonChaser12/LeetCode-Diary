import java.util.Arrays;
//https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=daily-question&envId=2024-01-14
public class determineIfTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "abbbzcf", word2 = "babzzcz";
        System.out.println(closeStrings(word1,word2));
    }
    static boolean closeStrings(String word1, String word2) {
//      So basically what it does is compare whether the frequency of each character in word1 is either greater than that of word2 or vice versa, but it shouldn't be true for the characters who are not common in both the strings.
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if((freq1[i]==0 && freq2[i]!=0 ) || (freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }
        //We use Arrays.sort here because as we have compared all the frequencies where there is no occurrence  of characters that aren't common in both the words.So we sort them for faster iterations and compare if they are equal or not.
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0;i<26;i++){
            if (freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
