//https://leetcode.com/problems/defanging-an-ip-address/description/
public class defangingAnIPAddress {
    public static void main(String[] args) {
        String s = "255.100.50.0";
        System.out.println(defangIPaddr(s));
    }
    static String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
