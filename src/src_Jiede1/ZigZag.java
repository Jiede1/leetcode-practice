package src_Jiede1;

import java.util.Arrays;

public class ZigZag {
	public String convert(String s, int nRows) {
		if(s.length()==0) return s;
		if(s.length()==1) return s;
		if(nRows==1) return s;
		int turn=1;
		int row=0;
		String[] ans = new String[nRows];
        Arrays.fill(ans, "");
        String ret="";
		for(int i=0;i<s.length();i++) {
			System.out.println(row);
			ans[row]+=s.charAt(i);
			row+=turn;
			if(row>nRows-1) {
				row=nRows-2;
				turn=-1;
			}
			if (row<0) {
				row=1;
				turn=1;
			}
			
		}
		for (int i = 0; i < nRows; i++) {
            ret += ans[i];
        }
		System.out.println(ret);
        return ret;	
	}
		
	public static void  main(String[] args) {
		ZigZag aZag=new ZigZag();
		aZag.convert("PAHNAPLSIIGYIR", 3);
		
	}
}
