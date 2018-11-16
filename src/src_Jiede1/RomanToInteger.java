package src_Jiede1;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
        HashMap<String, Integer> aHashMap=new HashMap<>();
        aHashMap.put("I", 1);
        aHashMap.put("V", 5);
        aHashMap.put("X", 10);
        aHashMap.put("L", 50);
        aHashMap.put("C", 100);
        aHashMap.put("D", 500);
        aHashMap.put("M", 1000);
        int res=0;
        int i=0;
        while(i<s.length()) {
        	if(String.valueOf(s.charAt(i)).equals("I")) {
        		if(i!=s.length()-1 && String.valueOf(s.charAt(i+1)).equals("V")) {
        			res+=4;
        			i+=2;
        			continue;
        		}
        		if(i!=s.length()-1 && String.valueOf(s.charAt(i+1)).equals("X")) {
        			res+=9;
        			i+=2;
        			continue;
        		}
        		res+=1;
        		i+=1;
        		continue;
        	}
        	else if(String.valueOf(s.charAt(i)).equals("X")) {
        		if(i!=s.length()-1 && String.valueOf(s.charAt(i+1)).equals("L")) {
        			res+=40;
        			i+=2;
        			continue;
        		}
        		if(i!=s.length()-1 &&String.valueOf(s.charAt(i+1)).equals("C")) {
        			res+=90;
        			i+=2;
        			continue;
        		}
        		res+=10;
        		i+=1;
        		continue;
        	}
        	else if(String.valueOf(s.charAt(i)).equals("C")) {
        		if(i!=s.length()-1 && String.valueOf(s.charAt(i+1)).equals("D")) {
        			res+=400;
        			i+=2;
        			continue;
        		}
        		if(i!=s.length()-1 && String.valueOf(s.charAt(i+1)).equals("M")) {
        			res+=900;
        			i+=2;
        			continue;
        		}
        		res+=100;
        		i+=1;
        		continue;
        	}
        	else{
        		res+=aHashMap.get(String.valueOf(s.charAt(i)));
        		i+=1;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		RomanToInteger aInteger=new RomanToInteger();
		System.out.println(aInteger.romanToInt("IX"));
	}
}
