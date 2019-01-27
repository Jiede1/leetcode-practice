/**  
* Title: PascalTriangle.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ13ÈÕ  
* @version 1.0  
*/  


package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> aList = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
        	List<Integer> temp = new ArrayList<>();
        	temp.add(1);
        	if(i!=0 && i!=1) { 
        		List<Integer> last = aList.get(i-1);
	        	for(int j=1;j<i;j++) {
	        		temp.add(last.get(j-1)+last.get(j));
	        	}
	        	temp.add(1);
        	}
        	else if(i==1) {
        		temp.add(1);
        	}
        	aList.add(temp);
        }
        return aList;
    }
}
