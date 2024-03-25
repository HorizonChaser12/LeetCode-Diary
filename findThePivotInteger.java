//https://leetcode.com/problems/find-the-pivot-integer/description/
public class findThePivotInteger {
    public static void main(String[] args) {
        int n=1;
        System.out.println(pivotInteger(n));
    }
    static int pivotInteger(int n) {
        int l=1;
        int r=n;
        int sumleft=0;
        int sumright=r;
        while(l<r){
          sumleft+=l;
          if (sumleft>sumright){
              while (sumright<sumleft){
                  r--;
                  sumright+=r;
              }
          }
          if (sumleft==sumright && l==r){
                return l + (r-l) / 2;
            }
          l++;
        }
        return -1;
    }
}
