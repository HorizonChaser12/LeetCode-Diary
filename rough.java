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
//        int[] nums = {1,1,0,1,1,1};
//        System.out.println(findMaxConsecutiveOnes(nums));
//        String allowed = "ab";
//        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
//        System.out.println(countConsistentStrings(allowed,words));
//        int[] nums = {3,4,5,6,7,1,2};
//        System.out.println(findMin(nums));
//        String s = "dvdf";
//        System.out.println(lengthOfLongestSubstring(s));
//        char[] letters = {'c','f','j'};
//        char target = 'a';
//        System.out.println(nextGreatestLetter(letters,target));
//          int[] nums = {0,0,0,1};
//          int k = 4;
//          System.out.println(longestOnes(nums,k));
//        int[] nums = {0,0,0,0,0};
//        int goal = 0;
//        System.out.println(numSubarraysWithSum(nums,goal));
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k =  m+n-1;
        for (int i = 0; i < n; i++) {
            int temp = nums2[i];
            nums1[k]=temp;
            k--;
        }
        Arrays.sort(nums1);
    }

//    static int numSubarraysWithSum(int[] nums, int goal) {
//        int left = 0;
//        int right = 0;
//        int count = 0;
//        int sum = 0;
//
//        while (right < nums.length) {
//            sum += nums[right];
//
//            // shrink window if sum exceeds goal
//            while (left <= right && sum > goal) {
//                sum -= nums[left];
//                left++;
//            }
//
//            // when sum == goal, count valid subarrays
//            if (sum == goal) {
//                count++;
//
//                // handle extra subarrays due to zeros
//                int temp = left;
//                while (temp < right && nums[temp] == 0) {
//                    count++;
//                    temp++;
//                }
//            }
//            right++;
//        }
//        return count;
//    }


//    static int longestOnes(int[] nums, int k) {
//        int zeroes = 0;
//        int left = 0;
//        int right = 0;
//        int max = 0;
//        while (right<nums.length && left <= right) {
//            if (nums[right] == 0) {
//                zeroes++;
//            }
//            if (zeroes > k) {
//                while(zeroes>k){
//                if (nums[left]==0){
//                    zeroes--;
//                }
//                left++;
//                }
//            }
//            max = Math.max(max, right - left + 1);
//            right++;
//
//        }
//        return max;
//    }



//    static char nextGreatestLetter(char[] letters, char target) {
//        int targetNum = target - 'a';
//        for(int i = 0;i <letters.length;i++){
//            if(letters[i]- 'a' >targetNum){
//                return letters[i];
//            }
//        }
//        return letters[0];
//    }

//    static int lengthOfLongestSubstring(String s) {
//        int left = 0;
//        int right = 0;
//        int ans = 0;
//        if (s.length()==1){
//            return 1;
//        }
//        while(left<=right && right<s.length()-1){
//            String sub = s.substring(left,right+1);
//            boolean contains = sub.contains(String.valueOf(s.charAt(right + 1)));
//            if (contains){
//                while(left<=right && sub.contains(String.valueOf(s.charAt(right + 1)))){
//                    left++;
//                    sub = s.substring(left,right+1);
//                }
//            }
//            right++;
//            ans = Math.max(ans,s.substring(left,right).length()+1);
//        }
//        return ans;
//    }

//    static int findMin(int[] nums) {
//        int start =  0;
//        int end = nums.length-1;
//        for (int i = 0; i < nums.length; i++) {
//            int middle = start + (end-start) / 2;
//            if(nums[middle]>nums[end]){
//                start = middle+1;
//            }
//            else if(nums[middle]<nums[start]){
//                end = middle;
//            }
//        }
//        return nums[start];
//    }

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

//    static String kangaroo(int x1, int v1, int x2, int v2) {
//        // Write your code here
//        int prevdiff = 0;
//        while (x1 != x2 || x1 < 10000) {
//            if (Math.abs(x1 - x2) > prevdiff) {
//                return "NO";
//            }
//            prevdiff = Math.abs(x1 - x2);
//            x1 += v1;
//            x2 += v2;
//
//        }
//        return "YES";
//    }


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
            if (nums[i] == 1) {
                temp++;
                ans = Math.max(ans, temp);
            } else {
                temp = 0;
            }

        }
        return ans;
    }

    static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    flag = false;
                }
            }
            if(flag){
            count++;
            }
        }
        return count;
    }
}





//1,4,6,5,18,9,12
//output {1,4},{4,6},{6,18},{5,18},{9,12},{18,-1},{12,-1}