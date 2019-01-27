/**  
* Title: CountandSay.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ22ÈÕ  
* @version 1.0  
*/  


package easy;
//https://blog.csdn.net/weixin_40039738/article/details/79965597

public class CountandSay {
	public String countAndSay(int n) {
		if(n==1) return "1";
		String index ="1";
		while(n>1) {
			n--;
			String temp = "";
			int count = 1;
			for(int k=0;k<index.length();k++) {
				if(k+1<index.length() && index.charAt(k) == index.charAt(k+1)) {
					count++;
				}
				else {
					temp += String.valueOf(count)+index.charAt(k);
					count=1;
				}
			}
			index = temp;
			System.out.println(temp);
		}
		return index;
	}
	
	public static void main(String[] args) {
		CountandSay aCountandSay = new CountandSay();
		System.out.println(aCountandSay.countAndSay(4));
				
	}
}
