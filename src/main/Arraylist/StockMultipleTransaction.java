//Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
//
//Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
//
//Examples:
//
//    Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
//    Output: 865

public class StockMultipleTransaction {

    public static int stockProfit(int prices[],int profit){
        for(int i=0;i<=prices.length-1;i++){
            for(int j=i+1 ; j<prices.length ; j++){
                if(prices[i]<prices[j]){
                    profit+=prices[j]-prices[i];
                }
                i++;
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int prices[] = {4, 2, 2, 2, 4};
        int profit=0;
       int results = stockProfit(prices,0);
        System.out.println(results);

    }
}
