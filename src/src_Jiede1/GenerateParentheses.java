/**  
* Title: GenerateParentheses.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ28ÈÕ  
* @version 1.0  
*/  

package src_Jiede1;

import java.util.ArrayList;
import java.util.List;


public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        doadd(n,n,list,"");
        return list;    
    }
    
    public static void doadd(int left, int right, List<String> list, String path){
    	//System.out.println(path);
    	
        if (left == 0 && right == 0){
            list.add(path);
            System.out.println(list);
            return;
        }
        
        if (left != 0)
            doadd(left-1,right,list,path+"(");
        if (right != 0 && right > left)
            doadd(left,right-1,list,path+")");
    }
    public static void main(String[] args) {
    	GenerateParentheses aGenerateParentheses=new GenerateParentheses();
    	aGenerateParentheses.generateParenthesis(2);
    }
}
