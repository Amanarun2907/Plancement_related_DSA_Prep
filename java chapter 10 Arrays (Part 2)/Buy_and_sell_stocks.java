//Given an array arr[] denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
//Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
public class Buy_and_sell_stocks {
     public static int sell_buy_stocks(int prices[]){
        int max_profit = 0; // set a max_profit variable equal to 0  
        int buy_price = Integer.MAX_VALUE; // buy_price = infinity 
        for (int i = 0;i<prices.length;i++)
        {
            if(buy_price<prices[i]) // case of profit
            {
                 int profit = prices[i]-buy_price; // today's profit
                 max_profit = Math.max(max_profit,profit); // global profit
            }
            else{
                buy_price = prices[i];
            }
            
        }
        return max_profit;

     }
    public static void main(String[] args) {
      int prices[] = {7,1,5,3,6,4}; 
      System.err.println(sell_buy_stocks(prices)); 
    }
}
// time complexity = O(n)



// class Solution {
//     // Function to find the days of buying and selling stock for max profit.
//     int stockBuySell(int arr[]) {
//         int n = arr.length;
//         if(n<=1){
//             return 0; // if array length is 0 then there is no meaning for buying and selling the stock 
//             // if array length is 1 then you have only one option to buy the stock that's it
//         }
//         // code here
//         // single transaction 
//         int buy_price = Integer.MAX_VALUE; // infinity
//         int max_profit_single = 0;   
//         for(int i =0;i<arr.length;i++)
//         {
//             if(buy_price<arr[i]) // profit 
//             {
//                 // profit = selling price - buying price
//                int profit = arr[i]-buy_price; // today's profit 
//                max_profit_single = Math.max(profit,max_profit_single) ; // global profit
//             }// here arr[i] is our selling price 
//             // loss
//             else{
//                 // i do not sell the stock this time 
//                 buy_price = arr[i];
//             }
//         }
//         int max_profit_multiple = 0;
//         for (int i = 1 ;i<arr.length;i++){
//             if(arr[i]>arr[i-1]){
//                  max_profit_multiple= max_profit_multiple+(arr[i]-arr[i-1]);
//             }
//         }
//         return Math.max( max_profit_multiple,max_profit_single);
//     }
// }


// dry run 
// arr[] = [100, 180, 260, 310, 40, 535, 695]
// n = arr.length = 7 
// n != 0 || n!=1 ----> condition false 
// single transaction 
// max_profit_single = 0;
// buy_price = infinity 
// i = 0 ---> (infinity>100) -----> buy_price = 100;
// i =1 -----> (100<180)------> profit = 180-100 = 80 , max_profit_single = max(80,0) = 80
// i= 2------>(100<260)--------> profit = 260-100 = 160 , max_profit_single = max(80,160) = 160
// i =3 ----->(100<310)------->profit = 310-100 = 210 , max_profit_single = max(210,160) = 210
// i = 4 ----->(100>40)-----> buy_price = 40
// i = 5 ----->(40<535)-----> profit = 535-40 = 495 ,max_profit_single = max(495,210) = 495
// i = 6----->(40<695)-----> profit = 695-40 = 655 ,max_profit_single = max(655,210) = 655
 // return max_profit_single = 655.................................................................


// multiple transaction 
//max_profit_multiple = 0;
//buy_price = infinity
// i = 1 ----> 180>100------> max_profit_multiple = max_profit_multiple+(180-100) = 0+80 = 80 
// i = 2 ----> 260>180------> max_profit_multiple = max_profit_multiple+(260-180) = 80+80 = 160 
// i = 3 ----> 310>260------> max_profit_multiple = max_profit_multiple+(310-260) = 50+160 = 210 
// i = 3 ----> 40<310------> no 
// i = 5 ----> 40<535------>  max_profit_multiple = max_profit_multiple+(535-40) = 495+210 = 705
// i  = 6 --->695>535-----> max_profit_multiple = max_profit_multiple+(695-535) = 705+160 = 865 



// max(max_profit_multiple,max_profit_single) --> max(875,655) = 875
