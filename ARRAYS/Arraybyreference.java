import java.util.*;
public class Arraybyreference{
  public static void update(int marks[], int nonchangable){
    nonchangable=10;// nonchangable wont change because it is pass by value it doesnt change in calling function and main function
    for(int i=0;i<=marks.length;i++){
      marks[i]=marks[i]+1;
    }
  }
  public static void main(String[] args){
    int  marks[]= {97,98,99};
    int nonchangable=5;// prints 5
    update(marks,nonchangable);
    System.out.println(nonchangable);
    for(int i=0;i<=marks.length;i++){
      System.out.print(marks[i]+" ");
    }
  }
}
    // array values are changed one by one by call by reference any changes or updates made will be changed in main functiion also
