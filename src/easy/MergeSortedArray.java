package easy;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: MergeSortedArray
 * @time: 2019/1/6$ 13:24$
 * @desc: 在此写上代码文件的功能描述
 **/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n -1;
        int i1 =m-1;
        int i2=n-1;
        while (i1>=0 && i2>=0) nums1[total--] = nums1[i1]>nums2[i2] ? nums1[i1--]:nums2[i2--];
        while(i2>=0) nums1[total--] = nums2[i2--];
    }
}
