package easy;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: RemoveElement
 * @time: 2019/1/4$ 10:55$
 * @desc: 在此写上代码文件的功能描述
 **/
public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val && i!=nums.length-1){
                    nums[j]=nums[i+1];
                }
                else if(nums[i]!=val){
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;
        }
}
