package src_Jiede1;

public class Atoi {
	long max=Integer.MAX_VALUE;
    long min=Integer.MIN_VALUE;
	 public int myAtoi(String str) {
		 String pstr = str.replace(" ","");
	     if(pstr.isEmpty()) return 0;
	     int len = pstr.length();
	     long num=0;
	     int sign=1; 
	     String aString="";
	     
	     for(int i=0;i<pstr.length();i++) {
	    	 if(pstr.charAt(i)>'9' || pstr.charAt(i)<'0') {
	    		 //System.out.println("dada");
	    		 if(pstr.charAt(i)=='-' || pstr.charAt(i)=='+') {
	    			 sign= pstr.charAt(i)=='-'?-1:1;
	    		 }
	    		 else {
	    			 break;
	    		 }
	    		 
	    	 }
	    	 else {
	    		 aString=aString.concat(pstr.substring(i, i+1));
	    	 }
	     }
	     //System.out.println(aString);
	     if(aString.length()==0) return 0;
	     if(aString.length()>10 && sign==1) return (int) max;
	     if(aString.length()>10 && sign==-1) return (int) min;
	     num=Long.parseLong(aString);
	     if(num>max) return (int) max;
	     if(num<min) return (int) min;
	     else return (int) (sign*num);
	     
	    
	 }
	 public static void main(String[] args) {
		 Atoi ds=new Atoi();
		 System.out.println(ds.myAtoi("423 ww ww 4545"));
	 }
}
