package src_Jiede1;

import java.util.HashMap;
import java.awt.print.Printable;
import java.util.*;

public class IntegerToRoman {
	public String intToRoman(int num) {
		assert(num<4000);
		String result="";
		int[] a= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] bString= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    for(int i=0;i<a.length;i++) {
	    	while (num/a[i]>=1) {
				num=num-a[i];
				result+=bString[i];
			}
	    }
	    return result;
    }
	public static void main(String[] args) {
		IntegerToRoman aIntegerToRoman=new IntegerToRoman();
		System.out.println(aIntegerToRoman.intToRoman(149));
	}
}
