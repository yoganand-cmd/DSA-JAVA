import java.util.*;
public class stockdsa8{
  public static int maxprofit(int[] prices){
    int buy=prices[0];
    int profit=0;
    for(int i=1;i<prices.length;i++){
      if(buy<prices[i]){
        profit=Math.max(prices[i]-buy,profit);
      }
      else{
        buy=prices[i];
      }
    }
    return profit;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] prices = new int[6];
        System.out.println("Enter 6 stock prices:");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit = " + maxprofit(prices));
        sc.close();
    }
}
// to find the maximim profit of the stock
