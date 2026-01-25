//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=daily-question&envId=2026-01-31

public class findSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
    char[] letters = {'c','f','j'};
    char target = 'd';
          System.out.println(nextGreatestLetter(letters,target));

}

static char nextGreatestLetter(char[] letters, char target) {
//    Simple brute force
//    int targetNum = target - 'a';
//    for(int i = 0;i <letters.length;i++){
//        if(letters[i]- 'a' >targetNum){
//            return letters[i];
//        }
//    }
//    return letters[0];
//    Binary Search
    int start = 0;
    int end  = letters.length-1;
    char ans = letters[0];
    while(start<=end){
        int mid = start + (end - start) / 2;
        if (letters[mid]>target){
            ans = letters[mid];
            end = mid -1;
        }
        else{
            start = mid+1;
        }
    }
    return ans;
    }
}
