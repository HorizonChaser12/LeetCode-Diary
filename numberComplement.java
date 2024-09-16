//https://leetcode.com/problems/number-complement/?envType=daily-question&envId=2024-08-22
//I couldn't solve it without using the inbuilt functions to covert a number into binary.Will be attaching a code that demonstrates the same without using the inbuilt function.
//https://leetcode.com/problems/number-complement/solutions/5671511/number-complement-beats-100-unique-and-easy-solution/?envType=daily-question&envId=2024-08-22
//This is the closest answer I could think of as of now.It shows how to convert the number by dividing it by 2 until it reaches 0.And is in O(n) time complexity too.
public class numberComplement {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
    static int findComplement(int num) {
        if(num==1 || num==0){
            return 0;
        }
        String str = Integer.toBinaryString(num);
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                res += '1';
            }
            else{
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}
