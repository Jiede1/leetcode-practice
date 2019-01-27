/**  
* Title: TwoSum.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ27ÈÕ  
* @version 1.0  
*/  

package easy;

import java.util.*;

public class TwoSum {
	private Map<Integer, Integer> table = new HashMap<>();
	public void add(int number) {
		int count = table.containsKey(number)?table.get(number):0;
		table.put(number, count+1);
	}
	public Boolean find(int value) {
		for(Map.Entry<Integer, Integer> entry:table.entrySet()) {
			int num = entry.getKey();
			int y = value - num;
			Boolean kBoolean = num==y && entry.getValue()>1 || num!=y && table.containsKey(y);
			if(kBoolean) return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
        // Your TwoSum object will be instantiated and called as such:
        // TwoSum twoSum = new TwoSum();
        // twoSum.add(number);
        // twoSum.find(value);
        TwoSum t = new TwoSum();
        t.add(1); t.add(3); t.add(5);
        System.out.printf("%s \n", t.find(4) == true? "Test case- find(4) success" : "Test case- find(4) failed"); // -> true
        System.out.printf("%s \n", t.find(7) == false ? "Test case- find(7) success" : "Test case- find(4) failed"); // -> true// -> false
        
    }
	
}
