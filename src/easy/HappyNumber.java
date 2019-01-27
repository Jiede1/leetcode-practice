/**  
* Title: HappyNumber.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019��1��27��  
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

            if(x==y) return false; //���ǵ��ǿ�������ѭ�����ص㣬���x��yһ��������
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
