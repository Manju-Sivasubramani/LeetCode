class Solution {
    public int compress(char[] chars) {
       int n=chars.length;
       int count=1;
       int max=0;
       char val='a';
       int j=0;
       String st="";
       for(int i=0;i<n-1;i++){
        if(chars[i]==chars[i+1]){
            val=chars[i+1];
            count++;
        }
        else{
            chars[j++]=chars[i];
            val=chars[i+1];
            if(count>1){
            st = Integer.toString(count);
            char[] ch=st.toCharArray();
            for(char c:ch){
            chars[j++]=c;
            }
            }
            count=1;
        }
       }
       chars[j++]=val;
       if(count>1){
       st = Integer.toString(count);
       char[] ch=st.toCharArray();
       for(char c:ch){
       chars[j++]=c;
       }
       }
        return j;
    }
}