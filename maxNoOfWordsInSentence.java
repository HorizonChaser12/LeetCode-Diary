//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
public class maxNoOfWordsInSentence {
    public static void main(String[] args) {
        String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        System.out.println(mostWordsFound(sentences));
    }
    static int mostWordsFound(String[] sentences) {
        int max=0;
        for (String ans : sentences) {
            int count = 0;
            for (int j = 0; j < ans.length(); j++) {
                if (ans.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max+1;
    }
}
