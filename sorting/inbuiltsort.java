import java.util.*;
//import java.utils.Arrays; import them specifically to use the methods
//import java.utils.Collections;
public class inbuiltsort{
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] arr={5,3,2,4,1};
  //Arrays.sort(arr);// sorting directly
  //Arrays.sort(arr,0,4);// sorting wih starting and ending index
  //Arrays.sort(arr, Collections.reverseOrder()); For using this we need to replace all int with Integer it acts as object and the collections print it in revrse order
  //Arrays.sort(arr,0,3, collections.reverseOrder()); same reverse order sort but with starting and ending element index
  printArr(arr);
  }
}
