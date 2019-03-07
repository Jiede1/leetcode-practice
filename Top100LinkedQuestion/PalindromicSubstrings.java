class PalindromicSubstrings {
public int countSubstrings(String s) {
    int res = 0, n = s.length();
    for(int i = 0; i<n ;i++ ){
        for(int j = 0; i-j >= 0 && i+j < n && s.charAt(i-j) == s.charAt(i+j); j++){
        	res++; //substring s[i-j, ..., i+j]
        }
        for(int j = 0; i-j >= 0 && i+1+j < n && s.charAt(i-j) == s.charAt(i+1+j); j++){
        	res++; //substring s[i-1-j, ..., i+j]
        }
    }
    return res;
}

}