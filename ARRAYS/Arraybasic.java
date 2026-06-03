import java.util.*;
public class Arraybasic{
  public static void main(String[] args){
    int marks[]=new int[50];
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("APTITUDE : " +marks[0]);
    System.out.println("CODING : " +marks[1]);
    System.out.println("ENGLISH : " +marks[2]);
    // this is for general  declaring and printing
    marks[2]=100; // updating the array this becomes latest updated value
    System.out.println("CODING : " +marks[2]);

    int percentage= [marks[0]+marks[1]+marks[2])/3;// performing operations on input
      System.out.println("percentage = "+percentage);

    System.out.print("length of array = "+marks.length);// for knowing length of array
  }
}
