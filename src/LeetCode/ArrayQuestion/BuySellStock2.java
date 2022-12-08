package LeetCode.ArrayQuestion;
// Q: 121 Best time to buy and Sell stock 2
public class BuySellStock2 {
    public int maxProfit(int[] prices){
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
    void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BuySellStock2 bss = new BuySellStock2();
        int [] prices = {7, 1, 5, 3, 6, 4};

        bss.maxProfit(prices);

    }
}
