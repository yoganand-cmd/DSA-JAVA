import java.util.*;
public class allsort{
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void bubble(int arr[]){
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length-1-i;j++){
              if(arr[j]>arr[j+1]){// for descending order change here
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
  }
  public static void select(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          int minpos=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[minpos]>arr[j]){//for descending order change here
              minpos=j;
              }
          }
       int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
      }
  }
  public static void insert(int[] arr){
      for(int i=1;i<arr.length;i++){
          int curr=arr[i];
          int prev=i-1;
          while(prev>=0&& arr[prev]>curr){// for descending order change here
              arr[prev+1]=arr[prev];
              prev--;
          }
          arr[prev+1]=curr;
      }
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size");
    int n=sc.nextInt();
    System.out.print("enter elements");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
        int[] bubbleArr=arr.clone();
        int[] selectArr=arr.clone();
        int[] insertArr=arr.clone();

        bubble(bubbleArr);
        select(selectArr);
        insert(insertArr);

        System.out.println("Bubble Sort:");
        print(bubbleArr);

        System.out.println("Selection Sort:");
        print(selectArr);

        System.out.println("Insertion Sort:");
        print(insertArr);
    }
}
