import java.util.*;
public class bubblesort{
  public static void bubble(int[] arr){
    int swap=0;
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          //swaping
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println(+swap);
  }
  public static void printarr(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size");
    int n=sc.nextInt();
    System.out.print("enter array elements");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    bubble(arr);
    System.out.print("sorted array");
    printarr(arr);
  }
}
//time complexity is bad O(n2) here the swap shows the count of how many swaps had done 
