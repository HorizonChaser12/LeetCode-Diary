//https://leetcode.com/problems/happy-number/description/
public class happyNumbers {
    public static void main(String[] args) {
       int n = 4;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int ans;
        do{
            ans = digitSum(n);
            n=ans;
        if (n == 1 || n == 7) {
            return true;
        } else if (n<10) {
            return false;
        }
        }while (true);
    }
    static int digitSum(int n){
        int sum=0;
        while (n!=0){
            int temp1=(int)Math.pow(n%10,2);
            n=n/10;
            sum=temp1+sum;
        }

        return sum;
    }
}
