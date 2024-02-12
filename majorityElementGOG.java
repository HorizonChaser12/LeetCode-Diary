public class majorityElementGOG {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {3,1,3,3,2};
        System.out.println(majorityElement(arr,N));
    }
    static int majorityElement(int[] arr, int size)
    {
        // your code here
        int count = 1; int res = 0;
        for(int i =1; i<size; i++){
            if(arr[res] == arr[i])
                count++;
            else
                count--;
            if(count==0){
                count = 1;
                res = i;
            }
        }

        int count2=0;
        for(int i = 0; i<size; i++){
            if(arr[res] == arr[i])
                count2 ++;
        }
        if(count2 <= (size/2))
            return -1;
        else{
            return  arr[res];

        }
    }
}
