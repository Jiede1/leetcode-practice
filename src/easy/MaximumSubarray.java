package easy;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: MaximumSubarray
 * @time: 2019/1/3$ 10:49$
 * @desc: https://blog.csdn.net/baimafujinji/article/details/78238497
 **/
public class MaximumSubarray {
    public int maxSubSumRec(int[] a){
        int max_end=a[0];
        int max_sf=a[0];
        for(int i=1;i<a.length;i++){
            max_sf = Math.max(max_sf,a[i]);
            max_end = Math.max(max_end,max_sf);
        }
        return max_end;
    }
    public static void main(String[] args){
        int a[]={1,-2,13,4,-9,3};
        MaximumSubarray p = new MaximumSubarray();
        System.out.println(p.maxSubSumRec(a));
    }
}
