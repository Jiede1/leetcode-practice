class DecodeString {
    public String decodeString(String s) {
        if(s.length()==0)return "";
        String a ="";
        for(int i=0;i<s.length();i++){
            if(isChar(s.charAt(i))==true){
                a+=s.charAt(i);
            }
            else if(isDigit(s.charAt(i))==true){
                int num=0;
                while(isDigit(s.charAt(i))){
                    num=num*10+s.charAt(i)-'0';
                    i++;
                }
                System.out.println(num);
                int begin = i+1;
                i++;
                int count=1;
                while(count!=0){
                    if(s.charAt(i)=='[')count++;
                    if(s.charAt(i)==']')count--;
                    i++;
                }
                i--;
                String ss = decodeString(s.substring(begin,i));
                while(num!=0) {a+=ss;num--;}
            }
        }
        return a;
        
    }
    public boolean isDigit(char p){
        return p>='0' && p<='9';
    }
    public boolean isChar(char p){
        return p>='a'&& p<='z'|| p>='A' && p<='Z';
    }
}	