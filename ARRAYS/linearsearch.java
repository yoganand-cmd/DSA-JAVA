import java.util.*;
public class linearsearch{
  public static linearsear(int numbers[],int key){
    for(int i=0;i<=marks.length;i++){
      if(i==key){
        return i;
      }
    }
    return-1;
  }
  public static void main(String[] args){
    int marks[]={2,4,8,10,12,14,16,18,20};
    int key=10;
    int index=linearsear(numbers,key);
    if(index==-1){
      System.out.println("key not found");
    }
    else{
      System.out.println("key is at index : "+index);
    }// time complexity of linear earch is O(n) searches all the  array for the key if not found the worst case complexity
  }
}
    
