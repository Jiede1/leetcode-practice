/**  
* Title: LongestCommonPrefix.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ17ÈÕ  
* @version 1.0  
*/  


package src_Jiede1;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        int length=strs.length;
        if(length==0) return "";
        int min=strs[0].length();
        for(int i=1;i<length;i++) {
        	min=Math.min(min, strs[i].length());
        }
        int j=0;
        int lenpre=0;
        int flag=0;
        while(j<min) {
        	char prefix=strs[0].charAt(j);
        	for(int i=0;i<length;i++) {
        		if(prefix!=strs[i].charAt(j)) {
        			flag=1;
        			break;
        		}
        		if(i==length-1) lenpre+=1;
        	}
        	if(flag==1)break;
        	j++;
        }
        if(lenpre==0) return "";
        return strs[0].substring(0, lenpre);
    }
	
	public static void main(String[] args) {
		LongestCommonPrefix strs=new LongestCommonPrefix();
		String[] string= {"1","1"};
		System.out.println(strs.longestCommonPrefix(string));
	}
}
