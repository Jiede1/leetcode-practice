package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
    	long startTime=System.currentTimeMillis();
        TwoSum solution = new TwoSum();
        int[] nums = new int[]{12, 2 ,7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        long endTime=System.currentTimeMillis();
        double excTime=(double)(endTime-startTime)/1000;
        System.out.println("Ö´ÐÐÊ±¼ä£º"+excTime+"s");
    }
}
