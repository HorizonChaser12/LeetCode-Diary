import java.util.Arrays;

public class boatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    static int numRescueBoats(int[] people, int limit) {
//      My code was very bad so copied down the best I could find in the solutions tab. It actually makes the proper use of two pointers and I didn't think of shortening it from the back and that was my mistake.
//      The simple intuition is that we lower the pointer in the back if the sum of the front pointer and back pointer is greater than the limit.And if it is not greater than forward the front pointer.
//        Arrays.sort(people);
//        int boats = 0;
//        int l = 0, r = people.length - 1;
//
//        while (l <= r) {
//            if (people[l] + people[r] <= limit) {
//                l++;
//            }
//            r--;
//            boats++;
//        }
//
//        return boats;

//     This is the best code with the lowest complexity and runtime.Uses binary search to find the combination of weights and then modifies it accordingly, and it uses the index of the arrays to find the combination rather than the weights.
//      Pretty good thinking and beautiful code.Precisely uses the concept of binary search.
        int[] buckets = new int[limit + 1];
        for(int weight : people ){
            buckets[weight]++;
        }
        int start = 0;
        int end = buckets.length - 1;
        int boats = 0;
        while(start<=end){
            while(start<=end && buckets[start] <= 0 ) start++;
            while(start<=end && buckets[end] <= 0 ) end--;

            if(buckets[start] <=0 && buckets[end] <=0) break;

            boats++;
            if(start + end <= limit){
                buckets[start]--;
            }
            buckets[end]--;
        }
        return boats;
    }
}
