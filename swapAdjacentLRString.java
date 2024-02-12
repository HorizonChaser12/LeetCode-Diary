//https://leetcode.com/problems/swap-adjacent-in-lr-string/description/
public class swapAdjacentLRString {
    public static void main(String[] args) {
        String start = "XXXXXLXXXX", end = "LXXXXXXXXX";
        System.out.println(canTransform(start,end));
//        https://leetcode.com/problems/swap-adjacent-in-lr-string/solutions/2285502/java-solution/
//        Actual good solution that proves to be benficial.
    }
    static boolean canTransform(String start, String end) {
//      Passes atmost 59/95 test cases
       char[] char1=start.toCharArray();
       int[] swapped= new int[char1.length];
        char[] char2=end.toCharArray();
        for (int i = 0; i < char1.length-1; i++) {
            if (start.equals(end)){
            return true;
            }
            if (char1[i]==char2[i]){
                continue;
            }
            if ((swapped[i]==0 && swapped[i+1]==0 ) && (char1[i]=='R' && char1[i+1]=='X')){
                swapped[i]++;
                swapped[i+1]++;
                start=swap(start,i);
            }
            else if ((swapped[i]==0 && swapped[i+1]==0 ) && (char1[i]=='X' && char1[i+1]=='L')){
                swapped[i]++;
                swapped[i+1]++;
                start=swap(start,i);
            }
        }
        System.out.println(start);
        return false;
    }
    static String swap(String start,int index){
        char[] char1= start.toCharArray();
        char temp=char1[index];
        char1[index]=char1[index+1];
        char1[index+1]=temp;
        return new String(char1);
    }
}
