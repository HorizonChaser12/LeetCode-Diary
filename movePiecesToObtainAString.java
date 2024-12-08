//https://leetcode.com/problems/move-pieces-to-obtain-a-string/description/?envType=daily-question&envId=2024-12-05
public class movePiecesToObtainAString {
    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start, target));
    }

    static boolean canChange(String start, String target) {
        StringBuilder str = new StringBuilder(start);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='L'){
                for (int j = 0; j < target.length(); j++) {
                    if (target.charAt(j)=='L'){
                        if (str.charAt(j)=='_'){
                            String temp = String.valueOf(str.charAt(i));
                            String temp1 = String.valueOf(str.charAt(j));
                            str.replace(j,j+1,temp);
                            str.replace(j+1,j+2,temp1);
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='R'){
                for (int j = 0; j < target.length(); j++) {
                    if (target.charAt(j)=='R'){
                        if (str.charAt(j)=='_'){
                            String temp = String.valueOf(str.charAt(i));
                            String temp1 = String.valueOf(str.charAt(j));
                            str.replace(j,j+1,temp);
                            str.replace(j+1,j+2,temp1);
                            break;
                        }
                        else if (str.charAt(j)=='R'){
                            str.replace(i+1,i+2,String.valueOf('_'));
                        }
                    }
                }
            }
        }
        return str.toString().equals(target);
    }
}
