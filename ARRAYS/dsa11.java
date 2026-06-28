import java.util.*;
public class dsa11{
  public static int trap(int[] height){
    int n=height.length;
    int res=0,l=0,r=n-1;
    int rMax=height[r], lMax=height[l];
    while(l<r){
      if(lMax<rMax){
        l++;
        lMax=Math.max(lMax, height[l]);
        res +=lMax-height[l];
      }else{
        r--;
        rMax=Math.max(rMax,height[r]);
        res +=rMax-height[r];
      }
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size: ");
    int n = sc.nextInt();
    int[] height = new int[n];
    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
          height[i] = sc.nextInt();
    }
    System.out.println(trap(height));
  }
}
// trapped rain water problem
    
