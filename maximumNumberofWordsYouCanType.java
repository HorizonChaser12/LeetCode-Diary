//https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
public class maximumNumberofWordsYouCanType {
    public static void main(String[] args) {
        String text = "leet code", brokenLetters = "e";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }
    static int canBeTypedWords(String text, String brokenLetters) {

//        My Solution 6ms Runtime
//        String[] string1 = text.split(" ");
//        int count=string1.length;
//        if (brokenLetters.isEmpty()){
//            return count;
//        }
//        for (int i = 0; i < string1.length; i++) {
//                int j=0;
//                int k=0;
//                while(k<string1[i].length()){
//                    if(string1[i].charAt(k)==brokenLetters.charAt(j)){
//                        count--;
//                        break;
//                    }
//                    if (j==brokenLetters.length()-1){
//                        k++;
//                        j=0;
//                        continue;
//                    }
//                    j++;
//                }
//            }
//        return count;


//        Another Solution Runtime is 3ms
        String[] arr = text.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(arr[i].contains(Character.toString(brokenLetters.charAt(j)))){
                    count++;
                    break;
                }
            }
        }
        return arr.length-count;
    }
}
