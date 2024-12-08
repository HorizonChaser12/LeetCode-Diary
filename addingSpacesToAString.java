//https://leetcode.com/problems/adding-spaces-to-a-string/description/?envType=daily-question&envId=2024-12-03
public class addingSpacesToAString {
    public static void main(String[] args) {
        String s = "icodeinpython";
        int[] spaces = {1,5,7,9};
        System.out.println(addSpaces(s,spaces));
    }
    static String addSpaces(String s, int[] spaces) {
//       Has high runtime ue to use of inbuilt libraries
        StringBuilder str = new StringBuilder(s);
        int extrabit = 0;
        for (int i = 0; i < spaces.length; i++) {
            str.insert(spaces[i]+extrabit," ");
            extrabit++;
        }
        return str.toString();
    }
}
