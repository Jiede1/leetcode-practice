/**  
* Title: BestTimetoBuyandSellStock.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ13ÈÕ  
* @version 1.0  
*/  


package easy;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
        int profit=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(mini>prices[i])mini=prices[i];
            if(prices[i]-mini>=profit){
                profit=prices[i]-mini;
            }
        }
        return profit;
    }
}
