/**  
* Title: FourSum.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê11ÔÂ25ÈÕ  
* @version 1.0  
*/  

package src_Jiede1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-3;i++) {
			if(i>0&& nums[i]==nums[i-1])continue;
			for(int j=i+1;j<nums.length-2;j++) {
				if(j>i+1&& nums[j]==nums[j-1])continue;
				int begin=j+1;
				int end=nums.length-1;
				while(end>begin) {
					//System.out.println(begin+","+end);
					int value=nums[i]+nums[j]+nums[begin]+nums[end];
					if(value==target) {
						res.add((List<Integer>) Arrays.asList(nums[i],nums[j],nums[begin],nums[end]));
						while(begin<end&& nums[begin]==nums[begin+1])begin++;
						while(begin<end&& nums[end]==nums[end-1])end--;
						begin++;
						end--;
					}
					else if(value<target) {
						begin++;
					}
					else end--;
				}
			}
		}
		return res;

    }
	public static void main(String[] args) {
		FourSum aFourSum=new FourSum();
		System.out.println(aFourSum.fourSum(new int[] {1,0,-1,0,-2,2}, 0));
	}
}
