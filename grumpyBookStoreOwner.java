//https://leetcode.com/problems/grumpy-bookstore-owner/description/?envType=daily-question&envId=2024-06-21
public class grumpyBookStoreOwner {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers,grumpy,minutes));
        
    }
    static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for(int i=0;i<customers.length;i++){
            if (grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int unsatisfied = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                unsatisfied += customers[i];
            }
        }
        int max = unsatisfied;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i - minutes] == 1) {
                unsatisfied -= customers[i - minutes];
            }
            if (grumpy[i] == 1) {
                unsatisfied += customers[i];
            }
            max = Math.max(max, unsatisfied);
        }
        return satisfied+max;
    }
}
