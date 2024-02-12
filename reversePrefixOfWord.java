//https://leetcode.com/problems/reverse-prefix-of-word/description/
public class reversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
    static String reversePrefix(String words, char ch) {
        int index2 = words.indexOf(ch);
        int index1 =0;
        char[] word=words.toCharArray();
        while(index1<=index2){
            char temp=word[index1];
            word[index1]=word[index2];
            word[index2]= temp;
            index1++;
            index2--;
        }
        return String.valueOf(word);
    }
}
