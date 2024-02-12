//https://leetcode.com/problems/power-of-two/description/
public class powerOfTwo {
    public static void main(String[] args) {
        int n=0;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }
        while(n!=1){
            if(n==0){
               return false;
            } else if (n%2==0) {
                n=n/2;
            } else{
                return false;
            }
        }
        return true;
    }
}
//Better solution but using Recursion
// if(n==0) return false;
//         // if( || n%2==0) return true;
//         return n==1||(n%2==0 && isPowerOfTwo(n/2));
