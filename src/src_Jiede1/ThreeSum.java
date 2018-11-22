/**  
* Title: ThreeSum.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ23ÈÕ  
* @version 1.0  
*/  


package src_Jiede1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
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
        			result.add(Arrays.asList(nums[i],nums[start],nums[end]));
        			start++;
                    end--;
        		}
        	}
        }
        return result;
    }
}
