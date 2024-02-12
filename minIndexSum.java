import java.util.Arrays;
//doubt as in solution the use of arraylist is there.

//https://leetcode.com/problems/minimum-index-sum-of-two-lists/
public class minIndexSum {
    public static void main(String[] args) {
        String[] first={"happy","sad","good"};
        String[] second={"sad","happy","good"};
        String[] realans=findRestaurant(first,second);
        System.out.println(Arrays.toString(realans));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        String[] ans=new String[30];
        int index=0;
        int temp=0;
        for (int i = 0; i <list1.length; i++) {
            for(int j=0;j< list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int indexSum=i+j;
                    if(indexSum>=temp){
                        temp=indexSum;
                        ans[index]=list1[i];
                        index++;
                        break;
                    }

            }
            }
        }
        ans = Arrays.stream(ans).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
        return ans;
    }
}
