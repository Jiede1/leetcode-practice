/**  
* Title: LengthofLastWord.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ24ÈÕ  
* @version 1.0  
*/  


package easy;

public class LengthofLastWord {
	 public int lengthOfLastWord(String s) {
	        if(s.length()==0) return 0;
	        int length =0;
	        for(int i=0;i<s.length();i++){
	            int p = s.charAt(i)-'A';
	            if(p>=0 && p<26 || p>=32 && p<32+26){
	                if(i!=0 && s.charAt(i-1)-'A'==32-65){
	                    length=1;
	                }else{
	                    length++;
	                }
	            }
	        }
	        return length;
	    }
}
