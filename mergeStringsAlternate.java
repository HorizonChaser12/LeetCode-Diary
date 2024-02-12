//https://leetcode.com/problems/merge-strings-alternately/description/
public class mergeStringsAlternate {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        StringBuilder merged= new StringBuilder();
        int temp=0;
        if(char1.length==char2.length){
            for(int i=0;i<char1.length;i++){
                merged.append(char1[i]).append(char2[i]);
            }
        }
        else {
            for(int i=0;i<Math.min(char1.length,char2.length);i++) {
                merged.append(char1[i]).append(char2[i]);
                temp=i+1;
            }
                    while(temp!=Math.max(char1.length,char2.length)){
                        if (char1.length>char2.length){
                            merged.append(char1[temp]);
                        }
                        else {
                            merged.append(char2[temp]);
                        }
                        temp++;

                    }
                }
        return merged.toString();
    }
}
