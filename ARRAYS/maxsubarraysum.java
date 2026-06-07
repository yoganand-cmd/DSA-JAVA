import java.util.*;
public class maxsubarraysum{
  public static void maxsubarrays(int numbers[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      int start=i;
      for(int j=i;j<numbers.length;j++){
        int end=j;
        currsum=0;
        for(int k=start;k<=end;k++){
          currsum+=numbers[k];
        }
        System.out.println(currsum);
        if(maxsum<currsum){
          maxsum=currsum;
        }
      }
    }
    System.out.println("max sum :" +maxsum);
  }
  public static void main(String[] args){
    int numbers[]={1,-2,6,-1,3};
    maxsubarrays(numbers);
  }
} // time complexity is bad (n3) but still this is basic bruete force solution can be optimised
