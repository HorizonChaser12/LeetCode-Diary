//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?leftPanelTab=1
public class secondOrderMaxMin {
    public static void main(String[] args) {
       int n=8;
       int[] a={48,96,46,75,71,5,58,57};
       int[] realans=getSecondOrderElements(n,a);
        for (int i = 0; i < 2; i++) {
            System.out.println(realans[i]);
        }
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int temp1=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
        int temp2=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                temp1=max;
                max=a[i];
            }
            else if (a[i]>temp1 && a[i]!=max) {
                temp1=a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i]<min){
                temp2=min;
                min=a[i];
            } else if (a[i]<temp2 && a[i]!=min) {
                temp2=a[i];
            }
        }
        return new int[]{temp1,temp2};
    }
}
