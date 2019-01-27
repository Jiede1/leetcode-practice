/**  
* Title: BestTimetoBuyandSellStockIII.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019��1��17��  
* @version 1.0  
*/  


package Hard;

public class BestTimetoBuyandSellStockIII {
	public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2)
            return 0;
        int [] maxBefore = new int[len];
        int min = prices[0];
        for(int i=1; i<len; i++){
            maxBefore[i] = Math.max(maxBefore[i-1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        int max = prices[len - 1];
        int ret = 0;
        for(int i=len-2; i>=0; i--){
            //�ҵ��������ļ۸�
            max = Math.max(prices[i], max);
            //���� = ���۸� - ��ǰ�۸� + ��ʱ����ʱ��һ�ε�����
            //ȡ���ֵ
            ret = Math.max(ret, max - prices[i] + maxBefore[i]);
        }
        return ret;
    }
	public static void main(String[] args) {
		BestTimetoBuyandSellStockIII aBestTimetoBuyandSellStockIII = new BestTimetoBuyandSellStockIII();
		int[] prices = {1,2,3,4,1,3};
		int ret = aBestTimetoBuyandSellStockIII.maxProfit(prices);
		System.out.println(ret);
	}
}
