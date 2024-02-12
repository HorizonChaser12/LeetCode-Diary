public class findKeyRandomQuestion {
    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int[] arr1 = getDigit(input1);
        int[] arr2 = getDigit(input2);
        int[] arr3 = getDigit(input3);
        int key = 0;
        for (int i = 0; i < 4; i++) {
            int digitKey = smallest(arr1[i], arr2[i], arr3[i]);
            key += digitKey * Math.pow(10, i);
        }
        System.out.println(key);
    }

    static int[] getDigit(int input1) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = input1 % 10;
            input1 /= 10;
        }
        return digits;
    }
    static int smallest(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}


