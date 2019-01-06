package easy;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: PlusOne
 * @time: 2019/1/6$ 12:43$
 * @desc: 在此写上代码文件的功能描述
 **/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        for(int i=length;i>=0;i--){
            if(digits[i]==9)digits[i]=0;
            else {
                digits[i] += 1;
                return digits;
            }
        }
        if(digits[0]==0){
            int[] res=new int[length+2];
            res[0]=1;
            return res;
        }
        return  digits;
    }
}
