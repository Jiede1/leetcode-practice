/**  
* Title: TwoSumII.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ18ÈÕ  
* @version 1.0  
*/  


package easy;
import java.util.*;
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
        TreeMap<Integer,Integer> a = new TreeMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){            
            if(a.containsKey(target-numbers[i])){
                result[0]= a.get(target-numbers[i]);
                result[1] = i+1;
                break;
            }
            else{
                a.put(numbers[i],i+1);
            }
        }
        return result;
    }
	public static void main(String[] args) {
		TwoSumII aIi = new TwoSumII();
		int[] a = {1,4,5,6,8,9};
		int[] res =aIi.twoSum(a,9);
		System.out.println(res[0]);
	}

}
