//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
//Hints helped a bit to get into the intuition.
public class deleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(makeFancyString(s));
    }
    static String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                char char1= s.charAt(i);
                str.append(s.charAt(i));
                str.append(s.charAt(i));
                do{
                    i++;
                }while(i<s.length() && s.charAt(i)==char1);
                i--;
            }
            else {
                str.append(s.charAt(i));
            }

        }
        return str.toString();
    }
}
