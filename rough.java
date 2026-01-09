import java.util.*;

public class rough {
    // Driver code
    public static void main(String[] args) {
//        int[] hours = {7,1,6,3};
//        System.out.println(code(hours));
//        String s= "byd";
//        System.out.println(getEncryptedString(s,4));
//            int n =3;
//        System.out.println(generateValidBinaryStrings(n));
//        System.out.println(kangaroo(0, 3, 4, 2));
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

//    static int code(int[] power) {
//        int maxDamage = 0;
//        int max = power[power.length-1];
//        int lastIncludedDamage = Integer.MIN_VALUE;
//        for (int i = power.length-1; i >= 0; i--) {
//            if ((power[i] > lastIncludedDamage + 2 || power[i] < lastIncludedDamage - 2 || power[i]==lastIncludedDamage) && power[i]<=max) {
//                maxDamage += power[i];
//                lastIncludedDamage = power[i];
//                max=Math.max(max,power[i]);
//            }
//        }
//        return maxDamage;
//    }

//    static String getEncryptedString(String s, int k) {
//        char[] char1 = s.toCharArray();
//        String ans = "";
//        int count = 0;
//        while(count!=s.length()){
//            int index =(count+k) % s.length();
//            ans+=char1[index];
//            count++;
//        }
//        return ans;
//    }

//    static List<String> generateValidBinaryStrings(int n) {
//        List<String> result = new ArrayList<>();
//        Queue<String> queue = new LinkedList<>();
//        if (n == 1) {
//            result.add("0");
//            result.add("1");
//            return result;
//        }
//        queue.add("0");
//        queue.add("1");
//        while (!queue.isEmpty()) {
//            String current = queue.poll();
//            if (current.length() == n) {
//                result.add(current);
//            } else {
//                queue.add(current + "1");
//                if (current.charAt(current.length() - 1) == '1') {
//                    queue.add(current + "0");
//                }
//            }
//        }
//        return result;
//    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int prevdiff = 0;
        while (x1 != x2 || x1 < 10000) {
            if (Math.abs(x1 - x2) > prevdiff) {
                return "NO";
            }
            prevdiff=Math.abs(x1-x2);
            x1 += v1;
            x2 += v2;

        }
        return "YES";
    }


    static int findMaxConsecutiveOnes(int[] nums) {
//            int i = 0;
//            int j = 0;
//            int ans = 0;
//            while(j!=nums.length){
//                if(nums[j]==0){
//                    i=j+1;
//                }
//                j++;
//                ans=Math.max(j-i,ans);
//            }
//            return ans;

        int ans = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                temp++;
                ans = Math.max(ans, temp);
            }
            else{
                temp=0;
            }

        }
        return ans;
    }

}





//1,4,6,5,18,9,12
//output {1,4},{4,6},{6,18},{5,18},{9,12},{18,-1},{12,-1}