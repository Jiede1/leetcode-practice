package src_Jiede1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Auther: Jiede1
 * @Date: 2018/12/9 21:41
 * @Description:
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        HashMap a=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(! a.containsKey(nums[i]))
                a.put(nums[i],1);
        }
        Iterator keys=a.keySet().iterator();
        for(int i=0;i<a.size();i++){
            int j=(int)keys.next();
            nums[i]=j;
        }
        return a.size();
    }
    public static void main(String[] args){
        RemoveDuplicatesfromSortedArray a=new RemoveDuplicatesfromSortedArray();
        int[] nums={1,1,3};
        System.out.println(a.removeDuplicates(nums));
    }
}
