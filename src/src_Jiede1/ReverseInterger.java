package src_Jiede1;


public class ReverseInterger {
	/*
	public int reverse(int x) {
		if(x<10 && x>-10) return x;
		if(x==-2147483648 || x==2147483647) return 0;
		int p=Math.abs(x);
		String xx="";
		while(p/10>0) {
			
			xx+=p%10;
			p=p/10;
			
		}
		xx+=String.valueOf(p);
		System.out.println(xx);
		String max="2147483647" ; //2^31 -1
		String min="2147483648" ;
		if(xx.compareTo(max)>=0 && max.length()==xx.length() && x>0) return 0;
		if(xx.compareTo(max)>=0 && max.length()==xx.length() && x<0) return 0;
		if(x>0) 
			return Integer.parseInt(xx);
		else 
			return -1*Integer.parseInt(xx);
	}
	*/
	static long INT_MIN=-2147483648;
	static long INT_MAX=2147483647;
	public int reverse(int x) {
	        long res = 0;
	        while(x!=0) {
	            res = res*10 + x%10;
	            x /= 10;
	        }
	        return (int) ((res< INT_MIN || res> INT_MAX) ? 0 : res);
	    }

	public static void main(String[] args) {
		ReverseInterger pInterger=new ReverseInterger();
		System.out.println(pInterger.reverse(67869));
	}

}
