import java.util.*;
public class selectionsort{
  public static void printarr(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void selection(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      int minpos=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[minpos]>arr[j]){// just change the greater than or less than operator for ascending order dorted array or decreasing order sorting array
          minpos=j;
        }
      }
      //swap
      int temp=arr[minpos];
      arr[minpos]=arr[i];
      arr[i]=temp;
    }
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
    selection(arr);
    System.out.print("sorted array");
    printarr(arr);
  }
}

//time complexity O(n2) simple swapcompared to bubble sort but time complexity is more as same
