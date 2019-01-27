/**  
* Title: HappyNumber.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019年1月27日  
* @version 1.0  
*/  
package easy;
public class HappyNumber {
	public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x) ;
            if(x==1) return true ;
            y = cal(cal(y));
            
            if(y==1) return true ;

            if(x==y) return false; //考虑到非快乐数会循环的特点，因此x和y一定会碰上
        }
        return true ;
    }
    public int cal(int n){  	
       int x=0;
       while(n!=0) {
    	   x=x+(n%10)*(n%10);
    	   n=n/10;
       }
       return x;
    }
    public static void main(String[] args) {
    	HappyNumber aHappyNumber =new HappyNumber();
    	System.out.println(aHappyNumber.isHappy(191));
    }
}
