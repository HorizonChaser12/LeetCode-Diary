//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/?envType=daily-question&envId=2024-04-04
//So basically the description of this question is quite bad ,and thus I created this answer from a discussion thread and it works perfectly.
//In this answer it finds the no. of entry brackets which are aligned together and that will be the maximum no, of nested brackets that will be there in the string because if there will be an ending bracket after a start bracket then it will lead to not being a nested bracket and thus the answer is justified.
public class maxNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
    static int maxDepth(String s) {
        StringBuilder ans = new StringBuilder(s);
        int i=0;
        int counter = 0 ;
        int maxCounter = 0;
        while(i<ans.length()){
            if(ans.charAt(i)=='('){
                counter++;
            }
            if(ans.charAt(i)==')'){
                counter-- ;
            }
            maxCounter=Math.max(counter,maxCounter);
            i++;
        }
        return maxCounter;
    }
}
