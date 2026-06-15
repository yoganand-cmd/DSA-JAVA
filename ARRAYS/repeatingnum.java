//Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:Input:nums = [1, 2, 3, 1]
//Output:   true 
//Example 2:Input:nums = [1, 2, 3, 4]
//Output:   false
import java.util.*;
public class repeatingnum{
    public static boolean repeat(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
          System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(repeat(numbers));
    }
}
// this is brute force method it has time complexity of O(n2)
//Acc to DSA sgeet #4
