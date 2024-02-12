import java.util.Arrays;

public class passwordChecker {
    public static void main(String[] args) {
//        String str="a987 abC012";
//        System.out.println(checkPassword(str));
//        int[] arr={12,3,14,56,77,13};
//        int length=arr.length;
//        int num=13;
//        int diff=2;
//        System.out.println(findCount(arr,length,num,diff));
//        int n = 4;
//        int m = 20;
//        System.out.println(differenceofSum(n, m));
//        int[] arr={1,8,0,2,3,5,6};
//        System.out.println(Largesmallsum(arr));
        int[] arr={9 ,8 ,3 ,-7 ,3 ,9};
        int sum=4;
        System.out.println(productSmallestPair(arr,sum));

    }
    static int productSmallestPair(int[] arr,int sum){
        Arrays.sort(arr);
        if (arr.length<2){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]<=sum){
                return arr[i]*arr[j];
                }
            }
            }
        return 0;
    }

//    static int Largesmallsum(int[] arr){
//        if (arr.length<=3){
//            return 0;
//        }
//        int max=0,temp1=0,min=Integer.MAX_VALUE,temp2=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2==0){
//                if (arr[i]>max){
//                    temp1=max;
//                    max=arr[i];
//                }
//            }
//            else {
//                if (min>arr[i]){
//                    temp2=arr[i];
//                    arr[i]=min;
//                }
//            }
//        }
//        return temp1+temp2;
//    }

//    static int differenceofSum(int n, int m) {
//        int sum = 0;
//        int sum2 = 0;
//        for (int i = 1; i <= m; i++) {
//            if (i % n != 0) {
//                sum = sum + i;
//            } else {
//                sum2 = sum2 + i;
//            }
//        }
//        return sum - sum2;
//    }

//    public static int OperationsBinaryString(String str){
//        if (str==null){
//            return -1;
//        }
//        int res = str.charAt (0) - '0';
//        for (int i = 1; i < str.length();) {
//            char prev = str.charAt (i);
//            i++;
//            if (prev == 'A')
//                res = res & (str.charAt (i) - '0');
//            else if (prev == 'B')
//                res = res | (str.charAt (i) - '0');
//            else
//                res = res ^ (str.charAt (i) - '0');
//            i++;
//        }
//        return res;
//    }
//    public static int checkPassword(String str){
//        //My code
//        char[] char1=str.toCharArray();
//        int count=0,count2=0;
//        for (int i = 0; i < char1.length; i++) {
//            if(char1[i]==' ' || char1[i]=='/' || Character.isDigit(char1[0])){
//                return 0;
//            } else if (Character.isAlphabetic(char1[i])) {
//                count++;
//            } else if (Character.isUpperCase(char1[i]) || Character.isDigit(char1[i])) {
//                count2++;
//            }
//            if (count>4 && count2>1){
//                return 1;
//            }
//        }
//        return 1;
    // Better code
//        if (str.length() < 4)
//            return 0;
//        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
//            return 0;
//        int num = 0, cap = 0;
//        for (int i = 0; i < str.length(); i++)
//        {
//            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
//                return 0;
//            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
//                cap++;
//            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
//                num++;
//        }
//        if (cap > 0 && num > 0)
//            return 1;
//        else
//            return 0;
//    }
//    static int findCount(int arr[], int length, int num, int diff){
//        int count=0;
//        for (int i = 0; i < length; i++) {
//            if (Math.abs(arr[i]-num)<=diff){
//                count++;
//            }
//        }
//        return count;
//    }


}

