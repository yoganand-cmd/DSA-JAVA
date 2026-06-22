import java.util.*;
public class Binarysearchprob2{
public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        // Left half is sorted
        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // Right half is sorted
        else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1;
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int num[]=new int[7];
  System.out.println("enter 7 numbers:");
  for(int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
  }
   System.out.println("Enter target:");
        int target = sc.nextInt();
        int result = search(num, target);
        System.out.println("Index: " + result);
        sc.close();
}
}// this is optimized code for the binarysearch problem with the time complexity of same O(log n)
