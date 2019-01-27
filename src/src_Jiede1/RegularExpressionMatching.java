package src_Jiede1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.util.Length;

public class RegularExpressionMatching {
	 public boolean isMatch(String s, String p) {
		//1、字符同时为空的情况
	       //1.1先考虑p为空，此时只要看s是否为空即可。
	       if(p.length()==0) return s.length()==0;
	       //1.2 再考虑s为空的情况
	       else if(s.length()==0)
	       {
		       //1.2.1 p分两种情况
	           //if(p.length()==0)return true;//情况1 p确实为空。
	           if(p.length()>1&&p.charAt(1)=='*')return isMatch(s,p.substring(2));//情况二，”匹配“意义上为空
	           else return false;
	       }
	 
	       //2、不同时为空则进行匹配
	       else 
	       {
	            //2.1 如果p的下一个字符为’*‘则分两种情况
	       	    if(p.length()>1&&p.charAt(1)=='*')
	       	    {
		    		//2.1.1 匹配下两个字符
	           		if(isMatch(s,p.substring(2))) return true;
	 		    	//2.1.2 匹配当前字符，注意：此时p字符串不步进
	           		else if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')return isMatch(s.substring(1),p);
	           		else return false;
	       	    }
	            //2.2 匹配当前字符
	       	    else
	           {
	              if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')return isMatch(s.substring(1),p.substring(1));
	              else return false;
	           }
	       }
	    }
	
	 
	 public static void main(String[] args) {
		 System.out.println(new RegularExpressionMatching().isMatch("ab", ".*"));
	 }
}
