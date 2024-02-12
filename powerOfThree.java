//https://leetcode.com/problems/power-of-three/description/
public class powerOfThree {
    public static void main(String[] args) {
        int n=0;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if (n<=0){
            return false;
        }
        while(n!=1){
            if (n%3==0){
                n=n/3;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
