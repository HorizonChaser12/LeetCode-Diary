//https://leetcode.com/problems/next-greater-element-iii/description/
public class NextGreaterElement3 {
    public static void main(String[] args) {
        int n=2147483476;
        System.out.println(nextGreaterElement(n));
    }
    static int nextGreaterElement(int n) {
        int size=0;
        long original=n;
        while(n>0){
            size++;
            n=n/10;
        }
        int[] digits = new int[size];
        int i=0;
        while (original>0){
            digits[i]=(int)original%10;
            original=original/10;
            i++;
        }
        int L=0;
        int R=0;
        boolean swapped=false;
        while(R<digits.length-1 && !swapped){
            if(digits[R]>digits[R+1]){
                L=R+1;
                R=0;
                while(R<digits.length){
                    if (digits[R]>digits[L]){
                        int temp=digits[R];
                        digits[R]=digits[L];
                        digits[L]=temp;
                        swapped=true;
                        break;
                    }
                    R++;
                }
            }
            R++;
        }
        if (!swapped){
            return -1;
        }
        int left=0;
        int right=L-1;
        while (left<right){
            int temp=digits[left];
            digits[left]=digits[right];
            digits[right]=temp;
            left++;
            right--;
        }
        for (int j = digits.length-1; j >= 0; j--) {
            original=original*10+digits[j];
            if(original>Integer.MAX_VALUE || original<=Integer.MIN_VALUE){
            return -1;
            }
        }
        return (int)original;
    }
}

//    given : 124651
//    answer : 125146
//    procedure:
//    Starting from the rightmost digit, going left. Find the first digit which is smaller than the previous digit.
//            In this example, 4 is smaller than 6. Remember 4 and its index 2.
//    Going from rightmost again. This time, find the first digit which is bigger than 4. It is 5 here.
//            Swap 4 and 5. The number becomes 125641.
//    Reverse all the digits which are right to 4's original index (That is 2), 641 should be reversed to 146 here.
//    And the answer is reached which is 125146.
