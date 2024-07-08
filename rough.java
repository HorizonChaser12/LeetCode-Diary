import java.util.*;

public class rough {
    // Driver code
    public static void main(String[] args) {
//        int[] hours = {7,1,6,3};
//        System.out.println(code(hours));
//        String s= "byd";
//        System.out.println(getEncryptedString(s,4));
            int n =3;
        System.out.println(generateValidBinaryStrings(n));


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

    static List<String> generateValidBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        if (n == 1) {
            result.add("0");
            result.add("1");
            return result;
        }
        queue.add("0");
        queue.add("1");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.length() == n) {
                result.add(current);
            } else {
                queue.add(current + "1");
                if (current.charAt(current.length() - 1) == '1') {
                    queue.add(current + "0");
                }
            }
        }
        return result;
    }

}


//1,4,6,5,18,9,12
//output {1,4},{4,6},{6,18},{5,18},{9,12},{18,-1},{12,-1}