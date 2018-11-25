/**  
* Title: ThreeSum.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ23ÈÕ  
* @version 1.0  
*/  


package src_Jiede1;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            if(i>0&&nums[i]==nums[i-1]) {
        		continue;
        	    }
        	int start=i+1;
        	int end=nums.length-1;
        	while(start<end) {
        		if(start > i + 1 && nums[start - 1] == nums[start]) {
        			start++;
        			continue;
        		}
        		if(nums[start]+nums[end]>-nums[i]) {
        			end--;
        		}
        		else if(nums[start]+nums[end]<-nums[i]) {
        			start++;
        		}
        		else {
        			result.add((ArrayList<Integer>) Arrays.asList(nums[i],nums[start],nums[end]));
        			start++;
                    end--;
        		}
        	}
        }
        return result;
    }
}
