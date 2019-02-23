/**  
* Title: CountingBits.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê2ÔÂ23ÈÕ  
* @version 1.0  
*/

public class CountingBits {
	public int[] countBits(int num) {
        int[] res = new int[num+1];
        if (num==0) {
        	res[0] = 0;
        	return res;
        }
        if (num==1) {
        	res[0] = 0;
        	res[1] = 1;
        	return res;
        }
        res[0] = 0;
        res[1] = 1;
        for(int i=1;num>=(int)Math.pow(2, i);i++) {
        	int length = (int) Math.pow(2, i);
        	for(int j=0;j<length;j++) {
        		int k= length + j;
        		if(k<=num) {
        			System.out.println(k);
        			res[k] = res[j]+1;
        		}
        		else {
        			break;
        		}
        	}	
        }
        return res;
    }
	
	public static void main(String[] args) {
		CountingBits aBits = new CountingBits();
		int[] b = aBits.countBits(2);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
