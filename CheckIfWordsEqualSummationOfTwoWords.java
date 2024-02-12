//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/description/
public class CheckIfWordsEqualSummationOfTwoWords {
    public static void main(String[] args) {
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
        System.out.println(isSumEqual(firstWord,secondWord,targetWord));
    }
    static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
//      7ms runtime
//        String word1="",word2="",word3="";
//        for(int i=0;i< firstWord.length();i++){
//            word1=word1+(firstWord.charAt(i)-'a');
//        }
//        for(int i=0;i< secondWord.length();i++){
//            word2=word2+(secondWord.charAt(i)-'a');
//        }
//        for(int i=0;i< targetWord.length();i++){
//            word3=word3+(targetWord.charAt(i)-'a');
//        }
//        return Integer.parseInt(word1)+Integer.parseInt(word2)==Integer.parseInt(word3);

//      1ms runtime

        int a=convert(firstWord);
        int b=convert(secondWord);
        int c=convert(targetWord);
        return a + b == c;
    }
    public static int convert(String ab){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ab.length();i++){
            int a=ab.charAt(i)-'a';
            String b=String.valueOf(a);
            sb.append(b);
        }
        String aa=""+sb;
        return Integer.parseInt(aa);
    }
}
