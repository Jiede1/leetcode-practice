package src_Jiede1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.util.Length;

public class RegularExpressionMatching {
	 public boolean isMatch(String s, String p) {
		//1���ַ�ͬʱΪ�յ����
	       //1.1�ȿ���pΪ�գ���ʱֻҪ��s�Ƿ�Ϊ�ռ��ɡ�
	       if(p.length()==0) return s.length()==0;
	       //1.2 �ٿ���sΪ�յ����
	       else if(s.length()==0)
	       {
		       //1.2.1 p���������
	           //if(p.length()==0)return true;//���1 pȷʵΪ�ա�
	           if(p.length()>1&&p.charAt(1)=='*')return isMatch(s,p.substring(2));//���������ƥ�䡰������Ϊ��
	           else return false;
	       }
	 
	       //2����ͬʱΪ�������ƥ��
	       else 
	       {
	            //2.1 ���p����һ���ַ�Ϊ��*������������
	       	    if(p.length()>1&&p.charAt(1)=='*')
	       	    {
		    		//2.1.1 ƥ���������ַ�
	           		if(isMatch(s,p.substring(2))) return true;
	 		    	//2.1.2 ƥ�䵱ǰ�ַ���ע�⣺��ʱp�ַ���������
	           		else if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')return isMatch(s.substring(1),p);
	           		else return false;
	       	    }
	            //2.2 ƥ�䵱ǰ�ַ�
	       	    else
	           {
	              if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')return isMatch(s.substring(1),p.substring(1));
	              else return false;
	           }
	       }
	    }
	
	 
	 public static void main(String[] args) {
		 System.out.println(new RegularExpressionMatching().isMatch("ab", ".*"));
	 }
}
