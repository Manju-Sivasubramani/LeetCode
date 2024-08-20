class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int n=word1.length();
        int m=word2.length();
        int len=1;
        if(n>=m){
            len=m;
        }
        else{
            len=n;
        }
        String st="";
        if(n>len){
            st=word1.substring(len,n);
        }
        if(m>n){
            st=word2.substring(len,m);
        }
        for(int i=0;i<len;i++){
            str=str+word1.charAt(i)+word2.charAt(i);
        }
        str=str+st;
        return str;
    }
}