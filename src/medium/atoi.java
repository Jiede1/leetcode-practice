class Solution {
    public int myAtoi(String str) {
        if(str.equals(""))return 0;
        int num=0;
		int sign=1;
		int i=0;
		while(str.charAt(i)==' ' && i<str.length()-1){
			i++;
		}
		if(i==str.length())return 0;
		if(str.charAt(i)=='-'){
			sign=-1;
            i++;
        }
        else if(str.charAt(i)=='+'){
            i++;
        }
		for(;i<str.length();i++){
			if(str.charAt(i)<'0' || str.charAt(i)>'9')break;
			if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && str.charAt(i)-'0'>Integer.MAX_VALUE %10){
				return sign==-1?Integer.MIN_VALUE :Integer.MAX_VALUE ;
			}
			num=num*10+str.charAt(i)-'0';
		}
		return sign*num;
    }
}