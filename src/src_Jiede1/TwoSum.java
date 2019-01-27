package src_Jiede1;

import java.util.Arrays;

public class TwoSum {
	/*
	 * public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }
	 */
	 public int[] twoSum(int[] nums, int target) {
		 for (int i=0;i<nums.length-1;i++) {
			 for (int j=i+1;j<nums.length;j++) {
				 if (target==nums[i]+nums[j])
					 //System.out.println("["+i+","+j+"]");
					 return new int[]{i,j};
			 }
		 } 
		 return null;
	 }
	 
	 public static void main(String[] args) {
		 long startTime=System.currentTimeMillis();
		 int[] nums = new int[] {100,12,4,3,6,70};
		 int target = 10;
		 TwoSum solution = new TwoSum();
		 System.out.println(Arrays.toString(solution.twoSum(nums,target)));
		 long endTime=System.currentTimeMillis();
	     float excTime=(float)(endTime-startTime)/1000;
	     System.out.println("Ö´ÐÐÊ±¼ä£º"+excTime+"s");
	 }
	
}
