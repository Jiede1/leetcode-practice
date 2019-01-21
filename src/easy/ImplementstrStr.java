/**  
* Title: ImplementstrStr.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ21ÈÕ  
* @version 1.0  
*/  


package easy;

public class ImplementstrStr {
		  public  int strStr(String haystack, String needle) {
		        int i, j;
		        for (i = j = 0; i < haystack.length() && j < needle.length();) {
		            if (haystack.charAt(i) == needle.charAt(j)) {
		                ++i; ++j;
		                
		                System.out.println("ij:"+i+","+j);
		            } else {
		                i -= j - 1; j = 0;
		                System.out.println(i+","+j);
		            }
		        }
		        return j != needle.length()? -1 : i - j;
		    }
		
	public static void main(String[] args) {
		ImplementstrStr aImplementstrStr = new ImplementstrStr();
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(aImplementstrStr.strStr(haystack, needle));
	}
}
