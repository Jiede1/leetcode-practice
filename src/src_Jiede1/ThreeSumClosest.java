/**  
* Title: ThreeSumClosest.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ24ÈÕ  
* @version 1.0  
*/  

package src_Jiede1;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(target-closest);  //have to abs
        if(diff==0)return closest;
        for(int i=0;i<nums.length-2;i++) {
        	int begin=i+1;
        	int end=nums.length-1;
        	while(end>begin) {
        		int temp=nums[i]+nums[begin]+nums[end];	
        		if(Math.abs(temp-target)<diff) {
        			diff=Math.abs(temp-target);
        			closest=temp;
        		}
        		if(temp<target)begin++;
        		else if(temp>target) end--;
        		else return target;
        	}
        }
        return closest;
    }
}
