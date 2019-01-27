/**  
* Title: SingleNumber.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ24ÈÕ  
* @version 1.0  
*/  


package easy;

import java.util.HashMap;
import java.util.Iterator;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        
	       HashMap<Integer, Integer> a=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(!a.containsKey(nums[i]))a.put(nums[i],1);
	            else{
	                a.put(nums[i],2);
	            }
	            
	        }
	        Iterator<Integer> iter = a.keySet().iterator();
	        while(iter.hasNext()){
	            Object j = iter.next();
	            int val = (Integer) a.get(j);
	            if(val==1) return (Integer)j;
	        }
	        return 0;
	    }
}
