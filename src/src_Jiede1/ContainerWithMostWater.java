package src_Jiede1;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        if(height.length<2) return 0;
        else {
        	int max=0;
        	int left=0;
        	int right=height.length-1;
        	while(left<right) {
        		max=Math.max(max, Math.min(height[left], height[right])*(right-left));
        		if(height[left]<height[right])left++;
        		else right--;
        	}
        	return max;
        }
    }
	public static void main(String[] args) {
		int[] p={1,8,6,2,5,4,8,3,7};
		System.out.println(new ContainerWithMostWater().maxArea(p));
	}
}
