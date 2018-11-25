/**  
* Title: LetterCombinationsOfaPhoneNumber.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018年11月24日  
* @version 1.0  
*/  

package src_Jiede1;

import java.util.ArrayList;

public class LetterCombinationsOfaPhoneNumber {
	public void dfs(ArrayList<String> res,String aString,String digits,int i,String[] p) {
		if(i==digits.length()) {
			if(aString.length()!=0)res.add(aString);
			return;
		}
		 String temp = p[digits.charAt(i) - '0'];
		for(int j=0;j<temp.length();j++) {
			String next=aString+temp.charAt(j);
			//System.out.println(next);
			dfs(res, next, digits, i+1, p);
		}
	}
	//递归+循环
	public ArrayList<String> letterCombinations(String digits) {
		String[] p= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		ArrayList<String> res=new ArrayList<>();
		String aString="";
		dfs(res,aString,digits,0,p);
		return res;
    }	
	public static void main(String[] args) {
		LetterCombinationsOfaPhoneNumber xCombinationsOfaPhoneNumber= 
				new LetterCombinationsOfaPhoneNumber();
		xCombinationsOfaPhoneNumber.letterCombinations("23");	
	}
}
