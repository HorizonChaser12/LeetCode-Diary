public class findUniqueBinaryString {
    public static void main(String[] args) {
        String[] nums= {"01","10"};
        System.out.println(findDifferentBinaryString(nums));
    }
    static String findDifferentBinaryString(String[] nums) {
        String str="";
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(k)=='0'){
                str=str+"1";
            }
            else if (nums[i].charAt(k)=='1'){
                str=str+"0";
            }
            k++;
        }
        return str;
    }
}
