/**  
* Title: BestTimetoBuyandSellStockII.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ17ÈÕ  
* @version 1.0  
*/  


package easy;

public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
        int res=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                res+=prices[i+1]-prices[i];
            }
        }
        return res;
    }
}
