//https://leetcode.com/problems/count-symmetric-integers/description/

public class symmetricInt {
    public static void main(String[] args) {
       int low = 1200, high = 1230;
        System.out.println(countSymmetricIntegers(low,high));
    }
    static int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            if(symmetric(i))
            {
                count++;
            }
        }
        return count;
    }
   static boolean symmetric(int n)
    {
        String s=String.valueOf(n);
        int len=s.length();
        if (len%2==1)
        {
            return false;
        }
        int mid=len/2;
        int s1=0,s2=0;
        for (int i=0;i<mid;i++)
        {
            s1+=s.charAt(i)-'0';
            s2+=s.charAt(len-i-1)-'0';
        }
        return s1==s2;
    }
}
