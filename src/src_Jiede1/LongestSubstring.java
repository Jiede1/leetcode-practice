package src_Jiede1;

import javax.sound.midi.VoiceStatus;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.prism.shader.FillRoundRect_Color_AlphaTest_Loader;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		System.out.println("faa");
		if (s == null || s.isEmpty()) return 0;
		if(s.length()==1) return 1;
		int result=0;
        int max=1;
        String liString =s.substring(0, 1);
        for(int i=1;i<s.length();i++) {
        	System.out.println(liString);
        	if(! liString.contains(s.substring(i,i+1))) {
        		liString = liString.concat(s.substring(i,i+1));
        		max += 1;
        		//System.out.println(s.substring(i,i+1));
        		//System.out.println(s);
        		System.out.println(liString);
        		if(result<max) result=max;
        	}
        	else {
        		if(result<max) result=max;
        		//System.out.println(result);
        		max = liString.length() - liString.indexOf(s.substring(i,i+1));
        		liString = liString.substring(liString.indexOf(s.substring(i,i+1))+1);
        		//System.out.println(liString);
        		liString = liString.concat(s.substring(i,i+1));
        		assert(max == liString.length());
        	}
        }
        System.out.println(result);
        return result;
    }
	public static void main(String[] args) {
		String aString = "";
		LongestSubstring AString = new LongestSubstring();
		AString.lengthOfLongestSubstring(aString);
	}

}
