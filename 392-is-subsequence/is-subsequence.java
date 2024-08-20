class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0;
        for(int j=i;j<m;j++){
            if(i==n){
                return true;
            }
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }  
        return i==n;     
    }
}