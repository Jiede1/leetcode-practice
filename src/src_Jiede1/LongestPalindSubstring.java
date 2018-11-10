package src_Jiede1;

public class LongestPalindSubstring {
	public String longestPalindrome(String s) {
		if(s.length()==0)return "";
		if(s.length()==1) return s;
        int maxlength=0;
        int centroid=0;
        int len=s.length();
        for(int i=0;i<s.length()-1;i++) {
        	int k=1;
        	//奇数
        	while(i+k<len&&i-k>=0&&s.charAt(i+k)==s.charAt(i-k)){ 
        		if(maxlength<2*k+1) {
        			maxlength=2*k+1;
        			centroid=i;
        			System.out.println("centroid:"+centroid);
        			System.out.println("maxl:"+maxlength);
        		}
        		k++;
        	}
        	System.out.println("centroidxxxxxxxx:"+centroid);
        	//偶数的情况
        	int row=i;
        	int high=i+1;
        	while(row>=0&&high<len&&s.charAt(row)==s.charAt(high)){ 
        		if(maxlength<high-row+1) {
        			maxlength=high-row+1;
        			
        			centroid=i;
        			System.out.println("cen11troid:"+centroid);
        	}
        		row--;
        		high++;
        }
        }
        System.out.println("cen1111111troid:"+centroid);
        System.out.println(maxlength);
        if(maxlength%2==0)
        	return s.substring(centroid-(maxlength-1)/2, centroid+maxlength/2+1);
        else
        	return s.substring(centroid-maxlength/2, centroid+maxlength/2+1);
    }
	public static void main(String[] args) {
		LongestPalindSubstring a = new LongestPalindSubstring();
		String pString=a.longestPalindrome("bb");
		System.out.println(pString);
	}
}
