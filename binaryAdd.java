//https://leetcode.com/problems/add-binary/
//INCOMPLETE!!
public class binaryAdd {
    public static void main(String[] args) {
       String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        String ans="";
        for (int i = a.length()-1; i >= 0; i--) {
            for (int j = b.length()-1; j >= 0 ; j--) {
                if((int)a.charAt(i)+(int)b.charAt(j) == (int)'b'){
                    ans=ans + "0";

                } else if ((int)a.charAt(i)+(int)b.charAt(j) == (int)'`') {
                    ans=ans + "1";
                }
            }
        }
        return ans;
    }
}
