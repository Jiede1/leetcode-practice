/**  
* Title: ValidParentheses.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ25ÈÕ  
* @version 1.0  
*/  

package src_Jiede1;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        if(s.length()==0 || s==null) return true;
        boolean result=false;
		Stack stack=new Stack();
		stack.push(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i);
			if(!stack.isEmpty()) {
				if((char)stack.peek()=='(' && c==')' || (char)stack.peek()=='{' && c=='}' || 
						(char)stack.peek()=='[' && c==']' ) {
					stack.pop(); 
				}
				else {
					stack.push(c);
				}
			}
			else {
				stack.push(c);
			}
    }
    if(stack.isEmpty()) return true;
	return false;
}
	public static void main(String[] args) {
		ValidParentheses aParentheses=new ValidParentheses();
		System.out.println(aParentheses.isValid("()[]{}"));
	}
}
