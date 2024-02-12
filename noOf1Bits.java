public class noOf1Bits {
    public static void main(String[] args) {
        int n= 00000000000000000000000010000000;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count=0;
        Long str=Integer.toUnsignedLong(n);
        while(str!=0) {
            if (str % 2 == 0) {
                str = str / 2;
            } else {
                str = str / 2;
                count++;
            }
        }
        return count;
    }
}
